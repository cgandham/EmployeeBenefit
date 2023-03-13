package pay.employee.app.choosebenefit.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pay.employee.app.choosebenefit.Service.IDeductionCalculator;
import pay.employee.app.choosebenefit.Service.IUserService;
import pay.employee.app.choosebenefit.model.Dependent;
import pay.employee.app.choosebenefit.model.Paycheck;
import pay.employee.app.choosebenefit.model.User;
import pay.employee.app.choosebenefit.utils.Constants;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserHelper {
    @Autowired
    private IUserService userService;
    @Autowired
    private IDeductionCalculator _deductionCalculator;
    public Paycheck getPaycheck(int userId) {
        Paycheck paycheck = new Paycheck();

        //get dependents
        List<Dependent> dependents = userService.getAllDependentsForUser(userId);
        User user = userService.getUser(userId);

        paycheck.setUser(user);
        Double deduction = _deductionCalculator.getDeductionCostPerPaycheck(user, dependents);
        paycheck.setDeductionPerPaycheck(deduction);
        paycheck.setDeductionPerYear(_deductionCalculator.getDeductionCostPerYear(user, dependents, Constants.PAYCHECKS_PER_YEAR));
        paycheck.setCostPaidAfterDeduction(Constants.EMPLOYEE_SALARY_PER_PAYCHECK - deduction);
        return paycheck;
    }

    public List<Paycheck> getAllEmployeePaychecks(){
        List<Paycheck> empPaychecks = new ArrayList<>();
        List<User> users = userService.getAllUsers();
        users.forEach(u-> {
            empPaychecks.add(getPaycheck(u.getId()));
        });
        return  empPaychecks;
    }
}

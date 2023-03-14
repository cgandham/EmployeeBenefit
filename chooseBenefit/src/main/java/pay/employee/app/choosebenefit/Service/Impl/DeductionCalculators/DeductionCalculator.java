package pay.employee.app.choosebenefit.Service.Impl.DeductionCalculators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pay.employee.app.choosebenefit.Service.IDiscountCalculator;
import pay.employee.app.choosebenefit.Service.IDeductionCalculator;
import pay.employee.app.choosebenefit.model.Dependent;
import pay.employee.app.choosebenefit.model.User;
import pay.employee.app.choosebenefit.utils.Constants;
import pay.employee.app.choosebenefit.utils.Enums;

import java.util.List;

@Component
public class DeductionCalculator implements IDeductionCalculator {

    @Autowired
    private IDiscountCalculator _discountCalculator;

    @Override
    public Double getDeductionCostPerPaycheck(User user, List<Dependent> dependents) {
        Double deduction = 0.0;
        for(int i=0; i< dependents.size(); i++){
            if(dependents.get(i).getName() != null && dependents.get(i).getName().toUpperCase().startsWith("A")){
                deduction += _discountCalculator.getDiscountedDeductionCost(Enums.UserRole.Dependent)  ;
            }
            else
                deduction += Constants.DEPENDENT_DEDUCTION_PER_YEAR;
        }
        if(user.getName() != null && user.getName().toUpperCase().startsWith("A"))
           deduction += _discountCalculator.getDiscountedDeductionCost(Enums.UserRole.Employee);
        else
            deduction += Constants.EMPLOYEE_DEDUCTION_PER_YEAR;


        return deduction;
    }

    @Override
    public Double getDeductionCostPerYear(User user,List<Dependent> dependents, int numberOfPaychecksPerYear) {
        return getDeductionCostPerPaycheck(user,dependents) * numberOfPaychecksPerYear;
    }

}

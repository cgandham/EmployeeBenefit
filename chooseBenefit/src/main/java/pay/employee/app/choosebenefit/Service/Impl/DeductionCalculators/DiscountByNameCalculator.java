package pay.employee.app.choosebenefit.Service.Impl.DeductionCalculators;

import org.springframework.stereotype.Component;
import pay.employee.app.choosebenefit.Service.IDeductionCalculator;
import pay.employee.app.choosebenefit.Service.IDiscountCalculator;
import pay.employee.app.choosebenefit.model.User;
import pay.employee.app.choosebenefit.utils.Constants;
import pay.employee.app.choosebenefit.utils.Enums;

@Component
public class DiscountByNameCalculator implements IDiscountCalculator {

    public Double getDiscountedDeductionCost(Enums.UserRole role) {

        switch (role){
            case Dependent :
                return Constants.DEPENDENT_DEDUCTION_PER_YEAR  * (Constants.DISCOUNT_RATE_BY_NAME / 100);
            case Employee:
                return Constants.EMPLOYEE_DEDUCTION_PER_YEAR  * (Constants.DISCOUNT_RATE_BY_NAME / 100);
        }
        return null;
    }
}

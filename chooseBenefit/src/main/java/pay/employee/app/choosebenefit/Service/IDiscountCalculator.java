package pay.employee.app.choosebenefit.Service;

import pay.employee.app.choosebenefit.utils.Enums;

public interface IDiscountCalculator {
    Double getDiscountedDeductionCost(Enums.UserRole role);
}

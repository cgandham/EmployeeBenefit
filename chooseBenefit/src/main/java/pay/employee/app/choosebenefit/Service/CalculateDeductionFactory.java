package pay.employee.app.choosebenefit.Service;

import pay.employee.app.choosebenefit.Service.Impl.DeductionCalculators.DeductionCalculator;
import pay.employee.app.choosebenefit.Service.Impl.DeductionCalculators.DiscountByNameCalculator;
import pay.employee.app.choosebenefit.utils.Enums.DeductionType;

public class CalculateDeductionFactory {

    public IDeductionCalculator getDeductionType(DeductionType type){
        switch(type) {
//            case DeductionPerDependent:
//                return new DeductionCalculator();
            default:
                return null;
        }
    }
}

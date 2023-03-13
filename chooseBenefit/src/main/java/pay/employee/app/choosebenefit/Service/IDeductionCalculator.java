package pay.employee.app.choosebenefit.Service;

import org.springframework.stereotype.Service;
import pay.employee.app.choosebenefit.model.Dependent;
import pay.employee.app.choosebenefit.model.User;

import java.util.List;

public interface IDeductionCalculator {
    Double getDeductionCostPerPaycheck(User user, List<Dependent> dependents);
    Double getDeductionCostPerYear(User user,List<Dependent> dependents, int numberOfPaychecksPerYear);

}

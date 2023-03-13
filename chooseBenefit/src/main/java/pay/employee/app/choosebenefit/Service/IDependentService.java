package pay.employee.app.choosebenefit.Service;

import pay.employee.app.choosebenefit.model.Dependent;
import pay.employee.app.choosebenefit.model.User;

import java.util.List;

public interface IDependentService {
    public Dependent getDependent(int userId);
    public List<Dependent> getAllDependentsForUser(int userId);
}

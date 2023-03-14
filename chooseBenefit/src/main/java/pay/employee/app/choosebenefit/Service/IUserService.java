package pay.employee.app.choosebenefit.Service;

import pay.employee.app.choosebenefit.model.Dependent;
import pay.employee.app.choosebenefit.model.Paycheck;
import pay.employee.app.choosebenefit.model.User;

import java.util.List;

public interface IUserService {
    public User addUser(User user);
    public void deleteUser(User user);
    public User getUser(int userId);
    public List<User> getAllUsers();
    public Dependent addDependent(Dependent dependent);
    public List<Dependent> getAllDependentsForUser(int userId);
    public User updateUser(User user);

}

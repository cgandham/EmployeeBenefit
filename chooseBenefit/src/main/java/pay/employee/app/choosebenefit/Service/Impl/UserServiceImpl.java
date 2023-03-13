package pay.employee.app.choosebenefit.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pay.employee.app.choosebenefit.Service.IDeductionCalculator;
import pay.employee.app.choosebenefit.Service.IUserService;
import pay.employee.app.choosebenefit.model.Dependent;
import pay.employee.app.choosebenefit.model.Paycheck;
import pay.employee.app.choosebenefit.model.User;
import pay.employee.app.choosebenefit.repository.UserRepository;
import pay.employee.app.choosebenefit.repository.DependantRepository;
import pay.employee.app.choosebenefit.utils.Constants;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DependantRepository dependentRepository;

    @Autowired
    private IDeductionCalculator _deductionCalculator;

    UserServiceImpl(IDeductionCalculator deductionCalculator){
        this._deductionCalculator = deductionCalculator;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(int userId) {
        return userRepository.getReferenceById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Dependent addDependent(Dependent dependent) {
        return dependentRepository.save(dependent);
    }

    @Override
    public List<Dependent> getAllDependentsForUser(int userId) {
        List<Dependent> dependents = dependentRepository.findAll().stream()
                                  .filter(x->x.getUserId() == userId).collect(Collectors.toList());
        return dependents;
    }

}

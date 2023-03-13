package pay.employee.app.choosebenefit.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pay.employee.app.choosebenefit.Service.IDependentService;
import pay.employee.app.choosebenefit.model.Dependent;
import pay.employee.app.choosebenefit.repository.DependantRepository;
import pay.employee.app.choosebenefit.repository.UserRepository;

import java.util.List;

@Service
public class DependentServiceImpl implements IDependentService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DependantRepository dependentRepository;

    @Override
    public Dependent getDependent(int userId) {
        return null;
    }

    @Override
    public List<Dependent> getAllDependentsForUser(int userId) {
        return null;
    }
}

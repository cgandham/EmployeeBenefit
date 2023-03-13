package pay.employee.app.choosebenefit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pay.employee.app.choosebenefit.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}

package pay.employee.app.choosebenefit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pay.employee.app.choosebenefit.model.Dependent;

@Repository
public interface DependantRepository extends JpaRepository<Dependent,Integer> {
}

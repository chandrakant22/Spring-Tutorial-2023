package in.asterisc.Day10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.asterisc.Day10.model.Employee;

public interface EmplyeeRepository extends JpaRepository<Employee, Integer>
{

}

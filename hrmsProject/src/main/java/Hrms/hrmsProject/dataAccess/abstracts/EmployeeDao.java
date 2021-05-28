package Hrms.hrmsProject.dataAccess.abstracts;




import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.concretes.User;

public interface EmployeeDao extends JpaRepository<Employee, Integer > {


	
	List<User> findByMailContaining(String mail);
	List<User> findByNationalityIdContaining(String nationalityId);
	
	
}

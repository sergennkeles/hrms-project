package Hrms.hrmsProject.dataAccess.abstracts;




import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.concretes.User;
import Hrms.hrmsProject.entities.dtos.CvDetailDto;

public interface EmployeeDao extends JpaRepository<Employee, Integer > {


	
	List<User> findByMailContaining(String mail);
	List<Employee> findByNationalityIdContaining(String nationalityId);
	
//	@Query("Select new Hrms.hrmsProject.entities.dtos.CvDetailDto(sch.schoolName, dep.departmentName) from Education edu inner join edu.school sch inner join edu.department dep"
//			)
//	List<CvDetailDto> getDetailByEmployeeCv();
}

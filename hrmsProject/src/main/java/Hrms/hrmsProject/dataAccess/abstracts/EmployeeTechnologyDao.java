package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeEducation;
import Hrms.hrmsProject.entities.concretes.EmployeeTechnology;

public interface EmployeeTechnologyDao extends JpaRepository<EmployeeTechnology, Integer>{

	List<EmployeeTechnology> findByEmployee_Id(int employeeId);
}

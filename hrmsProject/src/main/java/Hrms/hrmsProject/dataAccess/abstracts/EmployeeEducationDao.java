package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeEducation;

public interface EmployeeEducationDao extends JpaRepository<EmployeeEducation, Integer>{

	List<EmployeeEducation> findByEmployeeIdOrderByEndDate(int employeeId);
	List<EmployeeEducation> findByEmployee_Id(int employeeId);
}

package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeEducation;
import Hrms.hrmsProject.entities.concretes.EmployeeExperience;

public interface EmployeeExperienceDao extends JpaRepository<EmployeeExperience, Integer>{

	 
	List<EmployeeExperience> findByEmployeeIdOrderByExperience_EndDateDesc(int employeeId);
}

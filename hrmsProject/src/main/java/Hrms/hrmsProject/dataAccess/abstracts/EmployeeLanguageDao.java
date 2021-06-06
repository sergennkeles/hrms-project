package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeEducation;
import Hrms.hrmsProject.entities.concretes.EmployeeLanguage;

public interface EmployeeLanguageDao extends JpaRepository<EmployeeLanguage, Integer>{

	List<EmployeeLanguage> findByEmployee_Id(int employeeId);
}

package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeEducation;
import Hrms.hrmsProject.entities.concretes.EmployeeSocialMedia;

public interface EmployeeSocialMediaDao extends JpaRepository<EmployeeSocialMedia, Integer> {

	List<EmployeeSocialMedia> findByEmployee_Id(int employeeId);
}

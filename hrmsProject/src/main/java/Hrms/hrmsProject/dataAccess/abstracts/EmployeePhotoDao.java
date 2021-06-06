package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeEducation;
import Hrms.hrmsProject.entities.concretes.EmployeePhoto;

public interface EmployeePhotoDao extends JpaRepository<EmployeePhoto, Integer> {

	List<EmployeePhoto> findByEmployee_Id(int employeeId);
}

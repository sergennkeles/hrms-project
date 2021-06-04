package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeEducation;

public interface EmployeeEducationDao extends JpaRepository<EmployeeEducation, Integer>{

}

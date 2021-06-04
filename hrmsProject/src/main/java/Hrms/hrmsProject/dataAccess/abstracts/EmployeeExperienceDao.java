package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeExperience;

public interface EmployeeExperienceDao extends JpaRepository<EmployeeExperience, Integer>{

}

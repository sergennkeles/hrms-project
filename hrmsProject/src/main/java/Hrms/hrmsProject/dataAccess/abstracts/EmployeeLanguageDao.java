package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeLanguage;

public interface EmployeeLanguageDao extends JpaRepository<EmployeeLanguage, Integer>{

}

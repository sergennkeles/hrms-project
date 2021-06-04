package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeTechnology;

public interface EmployeeTechnologyDao extends JpaRepository<EmployeeTechnology, Integer>{

}

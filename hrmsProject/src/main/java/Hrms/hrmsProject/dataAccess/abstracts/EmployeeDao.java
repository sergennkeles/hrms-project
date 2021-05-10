package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer > {

}

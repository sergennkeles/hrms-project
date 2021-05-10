package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.entities.concretes.Employee;



public interface EmployeeService {

	void add(Employee employee);
	List<Employee> getAll();
	
}

package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import Hrms.hrmsProject.business.abstracts.EmployeeService;
import Hrms.hrmsProject.entities.concretes.Employee;
 



@RestController
@RequestMapping("api/employees")
public class EmployeesController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll() {
		return this.employeeService.getAll();
	}
	
	@PostMapping("/add")
	public void add(Employee employee) {
		
		employeeService.add(employee);
		System.out.println("Eklendi");
	}
}

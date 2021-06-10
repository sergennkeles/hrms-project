package Hrms.hrmsProject.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import Hrms.hrmsProject.business.abstracts.EmployeeService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.dtos.CvDetailDto;

@RestController
@RequestMapping("api/employees")
@CrossOrigin
public class EmployeesController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll() {
		return this.employeeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody Employee employee) {
		
	 return	this.employeeService.add(employee);
	
	}
	
	@GetMapping("/getDetailByEmployeeCv")
	public DataResult<CvDetailDto> getDetailByEmployeeCv(int employeeId)
	{
		return this.employeeService.getDetailByEmployeeCv(employeeId);
	}
	
	@GetMapping("/findByEmployeeId")
	public DataResult<List<Employee>> findByEmployeeId(int employeeId)
	{
		return this.employeeService.findByEmployeeId(employeeId);
	}
}

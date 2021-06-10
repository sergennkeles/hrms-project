package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.EmployeeEducationService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeEducation;


@RestController
@RequestMapping("/api/employeeeducations")
@CrossOrigin
public class EmployeeEducationsController {

	private EmployeeEducationService educationService;

	@Autowired
	public EmployeeEducationsController(EmployeeEducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployeeEducation employeeEducation)
	{
		return educationService.add(employeeEducation);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<EmployeeEducation>> getAll()
	{
		return educationService.getAll();
	}
	
	@GetMapping("/findByEmployeeIdOrderByEndDate")
	public DataResult<List<EmployeeEducation>> findByEmployeeIdOrderByEndDate(int employeeId)
	{
		return educationService.findByEmployeeIdOrderByEndDate(employeeId);
	}
}

package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.EmployeeExperienceService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeExperience;

@RestController
@RequestMapping("/api/employeeexperiences")
public class EmployeeExperiencesController {

	private EmployeeExperienceService employeeExperienceService;

	@Autowired
	public EmployeeExperiencesController(EmployeeExperienceService employeeExperienceService) {
		super();
		this.employeeExperienceService = employeeExperienceService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody EmployeeExperience employeeExperience)
	{
		return this.employeeExperienceService.add(employeeExperience);
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeeExperience>> getAll()
	{
		return this.employeeExperienceService.getAll();
	}
}

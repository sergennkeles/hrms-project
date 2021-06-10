package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.EmployeeLanguageService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeLanguage;

@RestController
@RequestMapping("/api/employeelanguages")
@CrossOrigin
public class EmployeeLanguagesController {

	private EmployeeLanguageService  employeeLanguageService;

	@Autowired
	public EmployeeLanguagesController(EmployeeLanguageService employeeLanguageService) {
		super();
		this.employeeLanguageService = employeeLanguageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployeeLanguage employeeLanguage)
	{
		return this.employeeLanguageService.add(employeeLanguage);
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeeLanguage>> getAll()
	{
		return this.employeeLanguageService.getall();
	}
}

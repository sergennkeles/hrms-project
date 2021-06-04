package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.EmployeeTechnologyService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;

import Hrms.hrmsProject.entities.concretes.EmployeeTechnology;

@RestController
@RequestMapping("/api/employeetechnologies")
public class EmployeeTechnologiesController {

	private EmployeeTechnologyService employeeTechnologyService;

	@Autowired
	public EmployeeTechnologiesController(EmployeeTechnologyService employeeTechnologyService) {
		super();
		this.employeeTechnologyService = employeeTechnologyService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployeeTechnology employeeTechnology)
	{
		return this.employeeTechnologyService.add(employeeTechnology);
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeeTechnology>> getAll()
	{
		return this.employeeTechnologyService.getAll();
	}
}

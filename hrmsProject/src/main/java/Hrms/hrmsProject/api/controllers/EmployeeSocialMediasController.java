package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.EmployeeSocialMediaService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeSocialMedia;

@RestController
@RequestMapping("/api/employeesocialmedias")
@CrossOrigin
public class EmployeeSocialMediasController {

	private EmployeeSocialMediaService employeeSocialMediaService;

	@Autowired
	public EmployeeSocialMediasController(EmployeeSocialMediaService employeeSocialMediaService) {
		super();
		this.employeeSocialMediaService = employeeSocialMediaService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployeeSocialMedia employeeSocialMedia)
	{
		return this.employeeSocialMediaService.add(employeeSocialMedia);
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeeSocialMedia>> getAll()
	{
		return this.employeeSocialMediaService.getAll();
	}
}

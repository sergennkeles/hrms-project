package Hrms.hrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.AuthService;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.concretes.Employer;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

	private AuthService authService;

	@Autowired
	public AuthController(AuthService authService) {
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmpolyer(@RequestBody Employer employer)
	{
		return authService.registerWithEmployer(employer);
	}
	
	@PostMapping("/registerEmployee")
	public Result registerEmpolyee(@RequestBody Employee employee)
	{
		return authService.registerWithEmployee(employee);
	}

	
}
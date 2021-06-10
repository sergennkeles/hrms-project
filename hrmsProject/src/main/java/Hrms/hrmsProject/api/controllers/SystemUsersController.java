package Hrms.hrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.SystemUserService;
import Hrms.hrmsProject.core.utilities.results.Result;

@RestController
@RequestMapping("api/systemusers")
@CrossOrigin
public class SystemUsersController {

	
	 SystemUserService systemUserService;

	@Autowired
	public SystemUsersController(SystemUserService systemUserService) {
		super();
		this.systemUserService = systemUserService;
	}
	
	@PutMapping("/employerConfirm")
	public Result employerConfirm(int id, boolean active)
	{
		return systemUserService.employerConfirm(id, active);
	}
}

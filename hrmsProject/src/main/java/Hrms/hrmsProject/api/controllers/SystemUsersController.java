package Hrms.hrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.SystemUserService;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.SystemUser;

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
	
	@PutMapping("jobadvertisementconfirm")
	public Result jobAdvertisementConfirm(int id, boolean active)
	{
		return systemUserService.jobAdvertisementConfirm(id, active);
	}
	
	@PutMapping("/update")
	public Result update(@RequestBody SystemUser systemUser)
	{
		return this.systemUserService.update(systemUser);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SystemUser systemUser)
	{
		return this.systemUserService.add(systemUser);
	}
}

package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.EmployeePhotoService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeePhoto;

@RestController
@RequestMapping()
public class EmployeePhotosController {

	private EmployeePhotoService employeePhotoService;

	@Autowired
	public EmployeePhotosController(EmployeePhotoService employeePhotoService) {
		super();
		this.employeePhotoService = employeePhotoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployeePhoto employeePhoto)
	{
		return this.employeePhotoService.add(employeePhoto);
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeePhoto>> getAll()
	{
		return this.employeePhotoService.getAll();
	}
}

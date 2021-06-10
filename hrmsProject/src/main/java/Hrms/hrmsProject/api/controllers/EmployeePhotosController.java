package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Hrms.hrmsProject.business.abstracts.EmployeePhotoService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.concretes.EmployeePhoto;

@RestController
@RequestMapping("/api/photos")
@CrossOrigin
public class EmployeePhotosController {

	private EmployeePhotoService employeePhotoService;

	@Autowired
	public EmployeePhotosController(EmployeePhotoService employeePhotoService) {
		super();
		this.employeePhotoService = employeePhotoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody MultipartFile file, @RequestParam int employeeId)
	{
		EmployeePhoto employeePhotoo =new EmployeePhoto();
		Employee employee =new Employee();
		employee.setId(employeeId);
		employeePhotoo.setEmployee(employee);
		
		return this.employeePhotoService.addCloudinary(employeePhotoo,file);
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeePhoto>> getAll()
	{
		return this.employeePhotoService.getAll();
	}
}

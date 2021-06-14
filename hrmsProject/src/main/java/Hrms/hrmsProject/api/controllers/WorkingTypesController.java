package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.WorkingTypeService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.WorkingType;

@RestController
@RequestMapping("/api/workingtypes")
@CrossOrigin
public class WorkingTypesController {

	private WorkingTypeService workingTypeService;

	@Autowired
	public WorkingTypesController(WorkingTypeService workingTypeService) {
		super();
		this.workingTypeService = workingTypeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<WorkingType>> getAll(){
		return this.workingTypeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody WorkingType workingType)
	{
		return this.workingTypeService.add(workingType);
	}
}

package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.TechnologyService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;

import Hrms.hrmsProject.entities.concretes.Technology;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {

	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Technology technology)
	{
		return this.technologyService.add(technology);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Technology>> getAll()
	{
		return this.technologyService.getAll();
	}
}

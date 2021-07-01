package Hrms.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrmsProject.business.abstracts.JobAdvertisementService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.JobAdvertisement;
import Hrms.hrmsProject.entities.dtos.JobAdvertisementDto;

@RestController
@RequestMapping("api/jobadvertisements")
@CrossOrigin
public class JobAdvertisementsController {

	private JobAdvertisementService advertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService advertisementService) {
		this.advertisementService=advertisementService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody JobAdvertisement advertisement)
	{
		return this.advertisementService.add(advertisement);
	}
	
	@GetMapping("/getall")
    public DataResult<List<JobAdvertisement>> getAll()
    {
        return this.advertisementService.getAll();
    }
	
	@GetMapping("/getActiveAdvertisement")
    public DataResult<List<JobAdvertisement>> getActiveAdvertisement()
    {
        return this.advertisementService.findByIsActiveTrue();
    }
	
	@GetMapping("/getPassiveAdvertisement")
    public DataResult<List<JobAdvertisement>> getPassiveAdvertisement()
    {
        return this.advertisementService.findByIsActiveFalse();
    }
	
	@GetMapping("/findByIsActiveTrueCreatedDateOrderByDesc")
    public DataResult<List<JobAdvertisement>> findByIsActiveTrueCreatedDateOrderByDesc()
    {
        return this.advertisementService.findByIsActiveTrueCreatedDateOrderByDesc();
    }
	
	@GetMapping("/findByIsActiveTrueAndEmployerId")
    public DataResult<List<JobAdvertisement>> findByIsActiveTrueAndEmployerId(int id)
    {
        return this.advertisementService.findByIsActiveTrueAndEmployerId(id);
    }
	
	@PutMapping("/setValueActive")
    public Result setValueActive(int id,boolean active)
    {
        return this.advertisementService.setValueOfActive(id,active);
    }
	
	@GetMapping("/getJobAdvertisementWithDetails")
	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementWithDetails()
	{
		return advertisementService.getJobAdvertisementWithDetails();
	}
	
	@GetMapping("/getById")
	public DataResult<JobAdvertisement> getById(int id)
	{
		return advertisementService.getById(id);
	}
}

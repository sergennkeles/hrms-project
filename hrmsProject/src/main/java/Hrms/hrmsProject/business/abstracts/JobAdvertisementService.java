package Hrms.hrmsProject.business.abstracts;


import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.JobAdvertisement;
import Hrms.hrmsProject.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>>  getAll();
	Result add(JobAdvertisement advertisement);
	DataResult<List<JobAdvertisement>> findByIsActiveTrue();
	DataResult<List<JobAdvertisement>> findByIsActiveFalse();
	DataResult<List<JobAdvertisement>> findByIsActiveTrueCreatedDateOrderByDesc();
	DataResult<List<JobAdvertisement>>  findByIsActiveTrueAndEmployerId(int id);
	DataResult<List<JobAdvertisementDto>> getJobAdvertisementWithDetails();
	DataResult<JobAdvertisement> getById(int id);
	Result setValueOfActive(int id,boolean active);

}

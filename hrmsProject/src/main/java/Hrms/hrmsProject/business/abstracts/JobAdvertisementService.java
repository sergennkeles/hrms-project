package Hrms.hrmsProject.business.abstracts;


import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>>  getAll();
	Result add(JobAdvertisement advertisement);
	DataResult<List<JobAdvertisement>> findByIsActiveTrue();
	DataResult<List<JobAdvertisement>> findByIsActiveTrueCreatedDateOrderByDesc();
	DataResult<List<JobAdvertisement>>  findByIsActiveTrueAndEmployerId(int id);
	
	Result setValueOfActive(int id,boolean active);

}

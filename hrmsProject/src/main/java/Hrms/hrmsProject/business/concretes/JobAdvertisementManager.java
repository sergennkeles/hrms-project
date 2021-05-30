package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.apache.axis.holders.TimeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.JobAdvertisementService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.JobAdvertisementDao;
import Hrms.hrmsProject.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	
	private JobAdvertisementDao advertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao advertisementDao) {
	
		this.advertisementDao=advertisementDao;
	}


	
	@Override
	public Result add(JobAdvertisement advertisement) {
		this.advertisementDao.save(advertisement);
		return new SuccessResult("İlan eklendi.");
	}



	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>> (advertisementDao.findAll(),"İlanlar listelendi.");
	}



	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrue() {
		Sort sort=Sort.by(Sort.Direction.ASC,"productName");
		return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.findByIsActiveTrue(),"Aktif iş ilanları listelendi.");
	}



	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrueCreatedDateOrderByDesc() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.findByIsActiveTrueOrderByCreatedDateDesc(),"Tarihe göre sıralandı.");
	}



	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrueAndEmployerId(int id) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.findByIsActiveTrueAndEmployerId(id),"Firmaya göre sıralandı.");
	}



	@Override
	public Result setValueOfActive(int id, boolean active) {
		
		JobAdvertisement tempValue=this.advertisementDao.findById(id).orElse(null);
		tempValue.setActive(active);
		this.advertisementDao.save(tempValue);
		return new SuccessResult("İlan pasif edildi.");
	}

}
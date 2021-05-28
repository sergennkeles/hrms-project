package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.JobService;
import Hrms.hrmsProject.core.utilities.business.BusinessRules;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.ErrorResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.JobDao;
import Hrms.hrmsProject.entities.concretes.Job;
import lombok.experimental.var;

@Service
public class JobManager implements JobService{

	private JobDao jobsDao;
	
	@Autowired
	public JobManager(JobDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}

	@Override
	public DataResult<List<Job>>  getAll() {
		
		return new SuccessDataResult<List<Job>>(this.jobsDao.findAll(), "İş pozisyonları listelendi.") ;
	}

	@Override
	public Result add(Job job) {

		Result result=BusinessRules.run(isNotExistsJobsName(job.getJobsName()));
		if (!result.isSuccess()) {
			
			return result;
		}
		
			jobsDao.save(job);
			return new SuccessResult("Meslek eklendi.");
		
		
	}
	
	
	private Result isNotExistsJobsName(String jobsName) {
		return !jobsDao.findByJobsName(jobsName).isEmpty() ? new SuccessResult()
				: new ErrorResult("Hata!!! Bu isimde meslek zaten kayıtlı");
	}

}

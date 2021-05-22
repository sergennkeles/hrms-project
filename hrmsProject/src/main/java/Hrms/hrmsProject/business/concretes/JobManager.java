package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.JobService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.dataAccess.abstracts.JobDao;
import Hrms.hrmsProject.entities.concretes.Job;

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

}

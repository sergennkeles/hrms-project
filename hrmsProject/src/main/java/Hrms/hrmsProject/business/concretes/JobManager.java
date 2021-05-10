package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.JobService;
import Hrms.hrmsProject.dataAccess.abstracts.JobsDao;
import Hrms.hrmsProject.entities.concretes.Job;

@Service
public class JobManager implements JobService{

	private JobsDao jobsDao;
	
	@Autowired
	public JobManager(JobsDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}

	@Override
	public List<Job> getAll() {
		
		return this.jobsDao.findAll();
	}

}

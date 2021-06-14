package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.WorkingTimeService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.WorkingTimeDao;
import Hrms.hrmsProject.entities.concretes.WorkingTime;

@Service
public class WorkingTimeManager implements WorkingTimeService {

	private WorkingTimeDao workingTimeDao;
	
	@Autowired
	public WorkingTimeManager(WorkingTimeDao workingTimeDao) {
		super();
		this.workingTimeDao = workingTimeDao;
	}

	@Override
	public Result add(WorkingTime workingTime) {
		 this.workingTimeDao.save(workingTime);
		return new SuccessResult("Çalışma zamanı eklendi.");
	}

	@Override
	public DataResult<List<WorkingTime>> getAll() {
		 
		return new SuccessDataResult<List<WorkingTime>>(this.workingTimeDao.findAll(),"Çalışma zamanları listelendi.");
	}

}

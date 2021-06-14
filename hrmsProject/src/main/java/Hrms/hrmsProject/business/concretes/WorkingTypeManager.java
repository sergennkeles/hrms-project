package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.WorkingTypeService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.WorkingTypeDao;
import Hrms.hrmsProject.entities.concretes.WorkingType;

@Service
public class WorkingTypeManager implements WorkingTypeService {

	private WorkingTypeDao workingTypeDao;
	
	@Autowired
	public WorkingTypeManager(WorkingTypeDao workingTypeDao) {
		super();
		this.workingTypeDao = workingTypeDao;
	}

	@Override
	public Result add(WorkingType workingType) {
		 this.workingTypeDao.save(workingType);
		return new SuccessResult("Çalışma şekli eklendi.");
	}

	@Override
	public DataResult<List<WorkingType>> getAll() {
		 
		return new SuccessDataResult<List<WorkingType>>(this.workingTypeDao.findAll(),"Çalışma şekilleri listelendi.");
	}

}

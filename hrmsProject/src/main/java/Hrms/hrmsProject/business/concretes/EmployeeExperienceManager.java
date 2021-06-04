package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeeExperienceService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeeExperienceDao;
import Hrms.hrmsProject.entities.concretes.EmployeeExperience;

@Service
public class EmployeeExperienceManager implements EmployeeExperienceService {

	private EmployeeExperienceDao employeeExperienceDao;
	
	@Autowired
	public EmployeeExperienceManager(EmployeeExperienceDao employeeExperienceDao) {
		super();
		this.employeeExperienceDao = employeeExperienceDao;
	}

	@Override
	public Result add(EmployeeExperience employeeExperience) {
		employeeExperienceDao.save(employeeExperience);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeeExperience>> getAll() {
		
		return new SuccessDataResult<List<EmployeeExperience>>(employeeExperienceDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeExperience>> findByEmployeeIdOrderByEndDateDesc(int employeeId) {
		
		return new SuccessDataResult<List<EmployeeExperience>>(employeeExperienceDao.findByEmployeeIdOrderByExperience_EndDateDesc(employeeId));
	}

}

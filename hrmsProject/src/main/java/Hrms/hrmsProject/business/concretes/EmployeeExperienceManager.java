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

	@Override
	public DataResult<List<EmployeeExperience>> findByEmployee_Id(int employeeId) {
		
		return new SuccessDataResult<List<EmployeeExperience>>(employeeExperienceDao.findByEmployee_Id(employeeId));
	}

	@Override
	public Result update(EmployeeExperience employeeExperience) {
		EmployeeExperience updateExperiencee=employeeExperienceDao.findById(employeeExperience.getEmployee().getId()).orElse(null);
		updateExperiencee.setId(employeeExperience.getId());
		updateExperiencee.setEmployee(employeeExperience.getEmployee());
		updateExperiencee.setExperience(employeeExperience.getExperience());
		employeeExperienceDao.save(updateExperiencee);
		return new SuccessResult("G??ncelleme ba??ar??l??.");
	}

}

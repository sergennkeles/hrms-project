package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeeLanguageService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeeLanguageDao;
import Hrms.hrmsProject.entities.concretes.EmployeeLanguage;

@Service
public class EmployeeLanguageManager implements EmployeeLanguageService {

	
	private EmployeeLanguageDao employeeLanguageDao;
	
	@Autowired
	public EmployeeLanguageManager(EmployeeLanguageDao employeeLanguageDao) {
		super();
		this.employeeLanguageDao = employeeLanguageDao;
	}

	@Override
	public Result add(EmployeeLanguage employeeLanguage) {
		employeeLanguageDao.save(employeeLanguage);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeeLanguage>> getall() {
		
		return new SuccessDataResult<List<EmployeeLanguage>>(employeeLanguageDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeLanguage>> findByEmployee_Id(int employeeId) {
		
		return new SuccessDataResult<List<EmployeeLanguage>>(employeeLanguageDao.findByEmployee_Id(employeeId));
	}

	@Override
	public Result update(EmployeeLanguage employeeLanguage) {
		 
		EmployeeLanguage updateLanguage=employeeLanguageDao.findById(employeeLanguage.getEmployee().getId()).orElse(null);
		updateLanguage.setId(employeeLanguage.getId());
		updateLanguage.setEmployee(employeeLanguage.getEmployee());
		updateLanguage.setLanguage(employeeLanguage.getLanguage());
		updateLanguage.setLanguageLevel(employeeLanguage.getLanguageLevel());
		employeeLanguageDao.save(updateLanguage);
		return new SuccessResult("Güncelleme başarılı");
	}

}

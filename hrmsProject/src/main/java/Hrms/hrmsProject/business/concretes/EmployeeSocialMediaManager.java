package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeeSocialMediaService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeeSocialMediaDao;
import Hrms.hrmsProject.entities.concretes.EmployeeSocialMedia;

@Service
public class EmployeeSocialMediaManager implements EmployeeSocialMediaService {

	private EmployeeSocialMediaDao employeeSocialMediaDao;
	
	@Autowired
	public EmployeeSocialMediaManager(EmployeeSocialMediaDao employeeSocialMediaDao) {
		super();
		this.employeeSocialMediaDao = employeeSocialMediaDao;
	}

	@Override
	public Result add(EmployeeSocialMedia employeeSocialMedia) {
		employeeSocialMediaDao.save(employeeSocialMedia);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeeSocialMedia>> getAll() {
		 
		return new SuccessDataResult<List<EmployeeSocialMedia>>(employeeSocialMediaDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeSocialMedia>> findByEmployee_Id(int employeeId) {
		 
		return new SuccessDataResult<List<EmployeeSocialMedia>>(employeeSocialMediaDao.findByEmployee_Id(employeeId));
	}

}

package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeeTechnologyService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeeTechnologyDao;
import Hrms.hrmsProject.entities.concretes.EmployeeTechnology;

@Service
public class EmployeeTechnologyManager implements EmployeeTechnologyService {

	private EmployeeTechnologyDao employeeTechnologyDao;
	
	@Autowired
	public EmployeeTechnologyManager(EmployeeTechnologyDao employeeTechnologyDao) {
		super();
		this.employeeTechnologyDao = employeeTechnologyDao;
	}

	@Override
	public Result add(EmployeeTechnology employeeTechnology) {
		employeeTechnologyDao.save(employeeTechnology);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeeTechnology>> getAll() {
		 
		return new SuccessDataResult<List<EmployeeTechnology>>(employeeTechnologyDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeTechnology>> findByEmployee_Id(int employeeId) {
		 
		return new SuccessDataResult<List<EmployeeTechnology>>(employeeTechnologyDao.findByEmployee_Id(employeeId));
	}

	@Override
	public Result update(EmployeeTechnology employeeTechnology) {
		EmployeeTechnology updateTechnology=employeeTechnologyDao.findById(employeeTechnology.getEmployee().getId()).orElse(employeeTechnology);
		updateTechnology.setId(employeeTechnology.getId());
		updateTechnology.setEmployee(employeeTechnology.getEmployee());
		updateTechnology.setTechnology(employeeTechnology.getTechnology());
		employeeTechnologyDao.save(updateTechnology);
		return new SuccessResult("Güncelleme başarılı");
	}

}

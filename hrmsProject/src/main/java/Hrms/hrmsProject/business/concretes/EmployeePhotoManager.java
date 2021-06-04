package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeePhotoService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeePhotoDao;
import Hrms.hrmsProject.entities.concretes.EmployeePhoto;

@Service
public class EmployeePhotoManager implements EmployeePhotoService {

	private EmployeePhotoDao employeePhotoDao;
	
	@Autowired
	public EmployeePhotoManager(EmployeePhotoDao employeePhotoDao) {
		super();
		this.employeePhotoDao = employeePhotoDao;
	}

	@Override
	public Result add(EmployeePhoto employeePhoto) {
		employeePhotoDao.save(employeePhoto);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeePhoto>> getAll() {
		
		return new SuccessDataResult<List<EmployeePhoto>>(employeePhotoDao.findAll());
	}

}

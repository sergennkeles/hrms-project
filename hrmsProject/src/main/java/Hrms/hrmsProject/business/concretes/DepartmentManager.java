package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.DepartmentService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.DepartmentDao;
import Hrms.hrmsProject.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService {

	private  DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}
	
	@Override
	public Result add(Department department) {
		 this.departmentDao.save(department);
		return new SuccessResult("Bölüm eklendi.");
	}



	@Override
	public DataResult<List<Department>> getAll() {
		
		return new SuccessDataResult<List<Department>>(departmentDao.findAll(),"Bölümler listelendi.");
	}

}

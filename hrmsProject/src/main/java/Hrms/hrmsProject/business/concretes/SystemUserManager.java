package Hrms.hrmsProject.business.concretes;

import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployerService;
import Hrms.hrmsProject.business.abstracts.SystemUserService;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.SystemUserDao;

@Service
public class SystemUserManager implements SystemUserService {

	private SystemUserDao systemUserDao;
	private EmployerService employerService;
	
	public SystemUserManager(SystemUserDao systemUserDao,EmployerService employerService) {
		
		this.systemUserDao = systemUserDao;
		this.employerService=employerService;
	}


	@Override
	public Result employerConfirm(int id, boolean active) {
		
		this.employerService.employerConfirm(id, active);
		return new SuccessResult();
	}

}

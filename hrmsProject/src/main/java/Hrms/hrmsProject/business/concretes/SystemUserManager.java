package Hrms.hrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployerService;
import Hrms.hrmsProject.business.abstracts.JobAdvertisementService;
import Hrms.hrmsProject.business.abstracts.SystemUserService;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.SystemUserDao;
import Hrms.hrmsProject.entities.concretes.SystemUser;

@Service
public class SystemUserManager implements SystemUserService {

	private SystemUserDao systemUserDao;
	private EmployerService employerService;
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao,EmployerService employerService, JobAdvertisementService jobAdvertisementService) {
		
		this.systemUserDao = systemUserDao;
		this.employerService=employerService;
		this.jobAdvertisementService=jobAdvertisementService;
	}


	@Override
	public Result employerConfirm(int id, boolean active) {
		
		this.employerService.employerConfirm(id, active);
		return new SuccessResult();
	}


	@Override
	public Result jobAdvertisementConfirm(int id, boolean active) {
		 this.jobAdvertisementService.setValueOfActive(id, active);
		 return new SuccessResult();
	}


	@Override
	public Result add(SystemUser systemUser) {
	 this.systemUserDao.save(systemUser);
		return new SuccessResult("Sistem kullanıcısı eklendi.");
	}


	@Override
	public Result update(SystemUser systemUser) {
	 SystemUser updateSystemUser=this.systemUserDao.findById(systemUser.getId()).orElse(null);
	 updateSystemUser.setId(systemUser.getId());
	 updateSystemUser.setFirstName(systemUser.getFirstName());
	 updateSystemUser.setLastName(systemUser.getLastName());
	 updateSystemUser.setMail(systemUser.getMail());
	 updateSystemUser.setPassword(systemUser.getPassword());
	 updateSystemUser.setRepeatPassword(systemUser.getRepeatPassword());
	 updateSystemUser.setTitle(systemUser.getTitle());
	 this.systemUserDao.save(updateSystemUser);
		return new SuccessResult("Sistem kullanıcısı güncellendi.");
	}

}

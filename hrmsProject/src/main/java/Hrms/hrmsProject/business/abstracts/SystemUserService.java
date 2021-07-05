package Hrms.hrmsProject.business.abstracts;

import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.SystemUser;

public interface SystemUserService {

	Result employerConfirm(int id,boolean active);
	Result jobAdvertisementConfirm(int id,boolean active);
	
	Result add(SystemUser systemUser);
	Result update(SystemUser systemUser);
}

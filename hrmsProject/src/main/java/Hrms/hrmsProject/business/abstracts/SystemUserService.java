package Hrms.hrmsProject.business.abstracts;

import Hrms.hrmsProject.core.utilities.results.Result;

public interface SystemUserService {

	Result employerConfirm(int id,boolean active);
	Result jobAdvertisementConfirm(int id,boolean active);
}

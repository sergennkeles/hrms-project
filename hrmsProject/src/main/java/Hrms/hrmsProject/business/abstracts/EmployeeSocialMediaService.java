package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeSocialMedia;

public interface EmployeeSocialMediaService {

	Result add(EmployeeSocialMedia employeeSocialMedia);
	DataResult<List<EmployeeSocialMedia>> getAll();
}

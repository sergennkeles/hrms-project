package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeePhoto;
import Hrms.hrmsProject.entities.concretes.EmployeeSocialMedia;

public interface EmployeeSocialMediaService {

	Result add(EmployeeSocialMedia employeeSocialMedia);
	Result update(EmployeeSocialMedia employeeSocialMedia);
	DataResult<List<EmployeeSocialMedia>> getAll();
	DataResult<List<EmployeeSocialMedia>> findByEmployee_Id(int employeeId);
}

package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeSocialMedia;
import Hrms.hrmsProject.entities.concretes.EmployeeTechnology;

public interface EmployeeTechnologyService {

	Result add(EmployeeTechnology employeeTechnology);
	Result update(EmployeeTechnology employeeTechnology);
	DataResult<List<EmployeeTechnology>> getAll();
	DataResult<List<EmployeeTechnology>> findByEmployee_Id(int employeeId);
}

package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeExperience;
import Hrms.hrmsProject.entities.concretes.EmployeeLanguage;

public interface EmployeeLanguageService {

	Result add(EmployeeLanguage employeeLanguage);
	Result update(EmployeeLanguage employeeLanguage);
	DataResult<List<EmployeeLanguage>> getall();
	DataResult<List<EmployeeLanguage>> findByEmployee_Id(int employeeId);
}

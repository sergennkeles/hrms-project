package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeEducation;
import Hrms.hrmsProject.entities.concretes.EmployeeExperience;
 

public interface EmployeeExperienceService {

	Result add(EmployeeExperience employeeExperience);
	DataResult<List<EmployeeExperience>> getAll();
	DataResult<List<EmployeeExperience>>  findByEmployeeIdOrderByEndDateDesc(int employeeId);
	DataResult<List<EmployeeExperience>> findByEmployee_Id(int employeeId);
}

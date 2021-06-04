package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeEducation;

public interface EmployeeEducationService {

	Result add(EmployeeEducation employeeEducation);
	DataResult<List<EmployeeEducation>> getAll();
}

package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeePhoto;

public interface EmployeePhotoService {

	Result add(EmployeePhoto employeePhoto);
	DataResult<List<EmployeePhoto>> getAll();
}

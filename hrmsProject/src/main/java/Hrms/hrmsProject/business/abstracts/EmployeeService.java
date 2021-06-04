package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.dtos.CvDetailDto;



public interface EmployeeService {

	Result add(Employee employee);
	DataResult<List<Employee>>  getAll();
	Result isNationalityIdExist(String nationalityId);
	Result isEmployeeMailExist(String mail);
	DataResult<List<CvDetailDto>> getDetailByEmployeeCv();
}

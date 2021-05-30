package Hrms.hrmsProject.business.abstracts;

import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.concretes.Employer;

public interface AuthService {

	Result registerWithEmployee(Employee employee);
	Result registerWithEmployer(Employer employer);
}

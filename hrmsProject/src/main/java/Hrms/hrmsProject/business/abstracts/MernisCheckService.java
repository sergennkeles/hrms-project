package Hrms.hrmsProject.business.abstracts;


import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Employee;

public interface MernisCheckService {
	
	Result checkRealPerson(Employee employee);
}

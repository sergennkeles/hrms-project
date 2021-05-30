package Hrms.hrmsProject.business.abstracts;


import java.util.Date;

import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Employee;

public interface MernisCheckService {
	
	Result checkRealPerson(Employee employee);
	
	Result checkVirtualPerson(String nationalityId,String firstName,String lastName,Date birthday);
}

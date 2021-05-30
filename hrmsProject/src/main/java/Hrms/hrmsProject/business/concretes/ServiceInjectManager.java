package Hrms.hrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeeService;
import Hrms.hrmsProject.business.abstracts.EmployerService;
import Hrms.hrmsProject.business.abstracts.VerificationEmployeeService;
import Hrms.hrmsProject.business.abstracts.VerificationEmployerService;
import Hrms.hrmsProject.core.utilities.adapters.MernisAdapterService;
import Hrms.hrmsProject.core.utilities.verification.VerificationManager;
import Hrms.hrmsProject.core.utilities.verification.VerificationService;

@Service
public class ServiceInjectManager {
	
	EmployeeService employeeService;
    EmployerService employerService;
	VerificationService verificationService;
	MernisAdapterService mernisCheckService;
	VerificationEmployeeService verifyEmployeeService;
	VerificationEmployerService verifyEmployerService;
	
	@Autowired
	public ServiceInjectManager() 
	{
		this.employeeService=new EmployeeManager(null);
		this.employerService=new EmployerManager(null);
		this.verificationService=new VerificationManager();
		this.mernisCheckService=new MernisAdapterService();
		this.verifyEmployerService= new VerificationEmployerManager(null);
		this.verifyEmployeeService= new VerificationEmployeeManager(null);
	}

}

package Hrms.hrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.VerificationEmployeeService;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.VerificationEmployeeDao;
import Hrms.hrmsProject.entities.concretes.VerificationEmployee;

@Service
public class VerificationEmployeeManager implements VerificationEmployeeService {
	
	private VerificationEmployeeDao verifyEmployeeDao;
	
	@Autowired
	public VerificationEmployeeManager(VerificationEmployeeDao verifyEmployeeDao) {
	
		this.verifyEmployeeDao=verifyEmployeeDao;
		
        }
	@Override
	public Result add(VerificationEmployee employee) {
		
		verifyEmployeeDao.save(employee);
		return new SuccessResult("Kod kaydedildi.");
	}

}

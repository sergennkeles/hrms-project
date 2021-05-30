package Hrms.hrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.VerificationEmployerService;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.VerificationEmployerDao;

import Hrms.hrmsProject.entities.concretes.VerificationEmployer;

@Service
public class VerificationEmployerManager implements VerificationEmployerService {

	private VerificationEmployerDao verifyEmployerDao;
	
	@Autowired
	public VerificationEmployerManager(VerificationEmployerDao verifyEmployerDao) {
	
		this.verifyEmployerDao=verifyEmployerDao;
		
        }
	@Override
	public Result add(VerificationEmployer employer) {
		
		verifyEmployerDao.save(employer);
		return new SuccessResult("Kod kaydedildi.");
	}

}

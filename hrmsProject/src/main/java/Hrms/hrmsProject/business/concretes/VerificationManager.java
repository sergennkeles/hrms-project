package Hrms.hrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.VerificationService;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.VerificationDao;
import Hrms.hrmsProject.entities.concretes.Verification;

@Service
public class VerificationManager implements VerificationService{

	VerificationDao verifyCodeDao;
	
	@Autowired
	public VerificationManager(VerificationDao verifyCodeDao) {

		this.verifyCodeDao = verifyCodeDao;
	}

	@Override
	public Result add(Verification verification) {
		
		this.verifyCodeDao.save(verification);
		return new SuccessResult("Doğrulama kodu kaydedildi.");
	}

}

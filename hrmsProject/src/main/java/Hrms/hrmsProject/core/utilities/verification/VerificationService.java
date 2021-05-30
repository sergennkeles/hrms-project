package Hrms.hrmsProject.core.utilities.verification;

import Hrms.hrmsProject.core.utilities.results.Result;

public interface VerificationService {
	
	void verificationLink(String mail);
	String verificationCode();

}

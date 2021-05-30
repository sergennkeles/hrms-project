package Hrms.hrmsProject.core.utilities.verification;


public interface CodeGeneratorService {
	
	String verificationLink(String mail);
	String verificationCode();

}

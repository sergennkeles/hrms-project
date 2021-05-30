package Hrms.hrmsProject.core.utilities.verification;

import java.util.UUID;

import Hrms.hrmsProject.business.abstracts.VerificationService;


public class CodeGeneratorManager implements CodeGeneratorService{



	@Override
	public String verificationLink(String mail) {
		UUID code=UUID.randomUUID();
		
		String link="https://hrmsverification/"+code.toString();
		
		System.out.println("Doğrulama maili "+ mail +" adresinize gönderildi."
				+ "Linke tıklayarak hesabınızı aktif edebilirsiniz"+ link);
		
		return link;
	}

	@Override
	public String verificationCode() {
		UUID code=UUID.randomUUID();
		String verifyCode=code.toString();
		System.out.println("Aktivasyonuz kodunuz "+ verifyCode);
		return verifyCode;
	}

}

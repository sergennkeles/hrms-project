package Hrms.hrmsProject.business.concretes;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.AuthService;
import Hrms.hrmsProject.core.utilities.business.BusinessRules;
import Hrms.hrmsProject.core.utilities.results.ErrorResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.concretes.Employer;
import Hrms.hrmsProject.entities.concretes.VerificationEmployer;

@Service
public class AuthManager implements AuthService {

	ServiceInjectManager services;
	@Autowired
	public AuthManager() {
		this.services=new ServiceInjectManager();
	}
	
	
	@Override
	public Result registerWithEmployee(Employee employee, String verify) {
	
		
		return null;
	}

	@Override
	public Result registerWithEmployer(Employer employer, String verify) {

		Result result=BusinessRules.run(checkMailAndDomain(employer.getMail(),employer.getWebSite()));
		
		if (result!=null) {
			return result;
		}
		this.services.employerService.add(employer);
		String code=services.verificationService.verificationCode();
		verificationCodeForEmployers(code, 0 , employer.getMail(), employer.getId());
		
		 return new SuccessResult("Kayıt başarıyla tamamlandı.");
	}

	private Result checkMailAndDomain(String mail,String site)
	{
		String [] mails=mail.split("@",2);
		String domain=site.substring(4,site.length());
		if (mails[1].equals(domain)) {
			return new SuccessResult();
		}
		return new ErrorResult("Mail adresi uzantısı ile web sitesinin alan adı uyuşmuyor.");
	}
	
		private void verificationCodeForEmployers(String code, int id, String email,int employerId) {
		
		VerificationEmployer verificationCode = new VerificationEmployer(id, code, false, LocalDate.now(), employerId);
		this.services.verifyEmployerService.add(verificationCode);
		System.out.println("Doğrulama maili gönderildi. " + email );
	
	}
	
}

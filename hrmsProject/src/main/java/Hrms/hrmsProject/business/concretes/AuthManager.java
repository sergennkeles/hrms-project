package Hrms.hrmsProject.business.concretes;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.AuthService;
import Hrms.hrmsProject.business.abstracts.EmployeeService;
import Hrms.hrmsProject.business.abstracts.EmployerService;
import Hrms.hrmsProject.business.abstracts.VerificationEmployeeService;
import Hrms.hrmsProject.business.abstracts.VerificationEmployerService;
import Hrms.hrmsProject.business.abstracts.VerificationService;
import Hrms.hrmsProject.core.utilities.adapters.MernisAdapterService;
import Hrms.hrmsProject.core.utilities.business.BusinessRules;
import Hrms.hrmsProject.core.utilities.results.ErrorResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.core.utilities.verification.CodeGeneratorManager;
import Hrms.hrmsProject.core.utilities.verification.CodeGeneratorService;
import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.concretes.Employer;
import Hrms.hrmsProject.entities.concretes.VerificationEmployee;
import Hrms.hrmsProject.entities.concretes.VerificationEmployer;


@Service
public class AuthManager implements AuthService {

	EmployeeService employeeService;
	EmployerService employerService;
	CodeGeneratorService codeGeneratorService;
	VerificationService verificationService;
	MernisAdapterService mernisCheckService;
	VerificationEmployeeService verifyEmployeeService;
	VerificationEmployerService verifyEmployerService;

	@Autowired
	public AuthManager(EmployeeService employeeService, EmployerService employerService,

			VerificationEmployeeService verifyEmployeeService, VerificationEmployerService verifyEmployerService,
			VerificationService verificationService) {

		this.employeeService = employeeService;
		this.employerService = employerService;
		this.codeGeneratorService = new CodeGeneratorManager();
		this.mernisCheckService = new MernisAdapterService();
		this.verifyEmployeeService = verifyEmployeeService;
		this.verifyEmployerService = verifyEmployerService;
		this.verificationService = verificationService;
	}

	@Override
	public Result registerWithEmployee(Employee employee) {
		
		Result result = BusinessRules.run(fakeMernisControl(employee.getNationalityId(), 
															employee.getFirstName(),
															employee.getLastName() , 
															employee.getBirthDay()),
										isNationaltyIdExist(employee.getNationalityId()),
										isEmployeeMailExist(employee.getMail()));
		if (result != null) {
			return result;
		}
		
		this.employeeService.add(employee);
		String code = codeGeneratorService.verificationLink(employee.getMail());
		verificationCodeForEmployees(code, 0, employee.getMail(), employee.getId());

		return new SuccessResult("Kayıt başarıyla tamamlandı.");
	}

	@Override
	public Result registerWithEmployer(Employer employer) {

		Result result = BusinessRules.run(checkMailAndDomain(employer.getMail(), employer.getWebSite()),
				isCompanyMailExist(employer.getMail()),
				checkNullFieldsForEmployer(employer),
				checkRepeatPassword(employer.getPassword(),employer.getRepeatPassword()));

		if (result != null) {
			return result;
		}
		this.employerService.add(employer);
		String code = codeGeneratorService.verificationCode();
		verificationCodeForEmployers(code, 0, employer.getMail(), employer.getId());

		return new SuccessResult("Kayıt başarıyla tamamlandı.");
	}

	private Result checkMailAndDomain(String mail, String site) {
		String[] mails = mail.split("@", 2);
		String domain = site.substring(4, site.length());
		if (mails[1].equals(domain)) {
			return new SuccessResult();
		}
		return new ErrorResult("Mail adresi uzantısı ile web sitesinin alan adı uyuşmuyor.");
	}

	private void verificationCodeForEmployers(String code, int id, String email, int employerId) {

		VerificationEmployer verificationCode = new VerificationEmployer(id, code, LocalDate.now(), employerId);
		this.verificationService.add(verificationCode);
		System.out.println("Doğrulama maili gönderildi. " + email);

	}

	private Result isCompanyMailExist(String mail) {

		if (this.employerService.isCompanyMailExist(mail).isSuccess()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu mail ile kayıtlı şirket var.");
		}

	}

	private Result checkNullFieldsForEmployer(Employer employer) {
		
		 if (employer.getCompanyName()!=null && employer.getMail()!=null 
				 && employer.getPassword()!=null && employer.getPhoneNumber()!=null
				     && employer.getRepeatPassword()!=null && employer.getWebSite()!=null) {
			return new SuccessResult();
		}
		 return new ErrorResult("Lütfen tüm alanları eksiksiz doldurun.");
	}
	
	private Result checkRepeatPassword(String password,String repeatPassword) {
		
		if (!password.equals(repeatPassword)) {
		return new ErrorResult("Parolalar eşleşmiyor.Lütfen kontrol edin.");
		}
		return new SuccessResult(); 
	}
	
	/**********************/
	
    private Result fakeMernisControl(String nationalityId, String firstName, String lastName, Date birthday) {
		
		if (this.mernisCheckService.checkVirtualPerson(nationalityId,firstName,lastName,birthday).isSuccess()) {
			return new SuccessResult();
		}
		return new ErrorResult("Doğrulama başarısız.");
	}
    
    private Result isNationaltyIdExist(String nationalityId) {
		if (this.employeeService.isNationalityIdExist(nationalityId).isSuccess()) {
			
			return new SuccessResult();
			}
			return new ErrorResult("Bu Tc kimlik no ile kayıtlı kullanıcı var.");
		}
    
    private void verificationCodeForEmployees(String code, int id, String email, int employerId) {

		VerificationEmployee verificationCode = new VerificationEmployee(id, code, LocalDate.now(), employerId);
		this.verificationService.add(verificationCode);
		System.out.println("Doğrulama maili gönderildi. " + email);

	}
    
    private Result isEmployeeMailExist(String mail) {

		if (this.employeeService.isEmployeeMailExist(mail).isSuccess()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu mail ile kayıtlı şirket var.");
		}

	}
	

}



package Hrms.hrmsProject.core.utilities.adapters;

import java.util.Date;

import Hrms.hrmsProject.business.abstracts.MernisCheckService;
import Hrms.hrmsProject.core.utilities.results.ErrorResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.entities.concretes.Employee;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterService implements MernisCheckService {

	@Override
	public Result checkRealPerson(Employee employee) {
		 KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		 boolean adapterResult=false;
	 try {
		
			
			 adapterResult=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(employee.
			 getNationalityId()) , employee.getFirstName().toUpperCase(),
			 employee.getLastName().toUpperCase(), employee.getBirthDay().getYear());
			 
			System.out.println("Doğrulama: "+(adapterResult ? "Başarılı":"Başarısız"));
	 	}
	
	 catch (Exception e) {
		
		 return new ErrorResult("Doğrulama başarısız");
		 
	}
	 	
	 
		return new SuccessResult("Doğrulama başarılı");
	}

	@Override
	public Result checkVirtualPerson(String nationalityId, String firstName, String lastName, Date birthday) {
		
	
		
		if (nationalityId.isEmpty() || firstName.isEmpty() || lastName.isEmpty() ||  birthday.toString().isEmpty()) {
			
			return new ErrorResult("Doğrulama başarısız");
		}
		return new SuccessResult("Doğrulama başarılı.");
	}
	

}

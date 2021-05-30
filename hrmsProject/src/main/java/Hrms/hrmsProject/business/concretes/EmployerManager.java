package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployerService;
import Hrms.hrmsProject.core.utilities.business.BusinessRules;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.ErrorResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployerDao;
import Hrms.hrmsProject.entities.concretes.Employer;
import Hrms.hrmsProject.entities.concretes.JobAdvertisement;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	public EmployerManager(EmployerDao employerDao) {
		
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
	
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"İşverenler listelendi."); 
				
	}

	@Override
	public Result add(Employer employer) {
		

		employerDao.save(employer);
		return new SuccessResult("İşveren eklendi.");
	}
	
	@Override
	 public Result isCompanyMailExist(String mail) {

		if (employerDao.findByMailContaining(mail).isEmpty()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu mail ile kayıtlı şirket var.");
		}

	}

	@Override
	public Result employerConfirm(int id, boolean active) {
		
		Employer tempValue=this.employerDao.findById(id).orElse(null);
		tempValue.setActive(active);
		this.employerDao.save(tempValue);
		return new SuccessResult("İşveren onaylandı.");
	}
}

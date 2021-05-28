package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeeService;
import Hrms.hrmsProject.business.abstracts.MernisCheckService;
import Hrms.hrmsProject.core.utilities.adapters.MernisAdapterService;
import Hrms.hrmsProject.core.utilities.business.BusinessRules;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.ErrorResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeeDao;
import Hrms.hrmsProject.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	private MernisCheckService checkEmployee;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
		this.checkEmployee=new MernisAdapterService();
	}

	@Override
	public Result add(Employee employee) {

	
		Result result = BusinessRules.run(
										isMailExist(employee.getMail()),
										isNationalityIdExist(employee.getNationalityId()),
										mernisControl(employee));
		if (result != null) {

			return result;
		} else {
			this.employeeDao.save(employee);
			return new SuccessResult("Kullanıcı eklendi.");
		}

	}

	@Override
	public DataResult<List<Employee>> getAll() {

		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "Listelendi.");
	}

	
	private Result isMailExist(String mail) {

		if (employeeDao.findByMailContaining(mail).isEmpty()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu mail ile kayıtlı kullanıcı var.");
		}

	}
	
	private Result isNationalityIdExist(String nationalityId) {

		if (employeeDao.findByNationalityIdContaining(nationalityId).isEmpty()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu Tc kimlik no ile kayıtlı kullanıcı var.");
		}
	}
	
	private Result mernisControl(Employee employee) {
		
		if (this.checkEmployee.checkVirtualPerson(employee.getNationalityId(), 
												employee.getFirstName(),
												employee.getLastName(),
												employee.getBirthDay()).isSuccess()) {
			return new SuccessResult();
		}
		return new ErrorResult("Doğrulama başarısız.");
	}
}

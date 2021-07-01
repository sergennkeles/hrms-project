package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeeEducationService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeeEducationDao;
import Hrms.hrmsProject.entities.concretes.EmployeeEducation;

@Service
public class EmployeeEducationManager implements EmployeeEducationService {

	private EmployeeEducationDao employeEducationDao;
	
	@Autowired
	public EmployeeEducationManager(EmployeeEducationDao employeEducationDao) {
		super();
		this.employeEducationDao = employeEducationDao;
	}

	@Override
	public Result add(EmployeeEducation employeeEducation) {
		employeEducationDao.save(employeeEducation);
		return new SuccessResult("Eğitim bilgileri eklendi.");
	}

	@Override
	public DataResult<List<EmployeeEducation>> getAll() {
		
		return new SuccessDataResult<List<EmployeeEducation>>(employeEducationDao.findAll(),"Eğitim bilgileri listelendi");
	}

	@Override
	public DataResult<List<EmployeeEducation>> findByEmployeeIdOrderByEndDate(int employeeId) {
		
		return new SuccessDataResult<List<EmployeeEducation>>(employeEducationDao.findByEmployeeIdOrderByEndDate(employeeId));
	}

	@Override
	public DataResult<List<EmployeeEducation>> findByEmployee_Id(int employeeId) {
		
		return new SuccessDataResult<List<EmployeeEducation>>(employeEducationDao.findByEmployee_Id(employeeId));
	}

	@Override
	public Result update(EmployeeEducation employeeEducation) {
		 EmployeeEducation updatEducation=employeEducationDao.findById(employeeEducation.getEmployee().getId()).orElse(null);
		 updatEducation.setId(employeeEducation.getId());
		 updatEducation.setEducation(employeeEducation.getEducation( ));
		 updatEducation.setEmployee(employeeEducation.getEmployee());
		 updatEducation.setStartDate(employeeEducation.getStartDate());
		 updatEducation.setEndDate(employeeEducation.getEndDate());
		 employeEducationDao.save(updatEducation);
		return new SuccessResult("Güncelleme başarılı.");
	}

}

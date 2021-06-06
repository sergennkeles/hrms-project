package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeeEducationService;
import Hrms.hrmsProject.business.abstracts.EmployeeExperienceService;
import Hrms.hrmsProject.business.abstracts.EmployeeLanguageService;
import Hrms.hrmsProject.business.abstracts.EmployeePhotoService;
import Hrms.hrmsProject.business.abstracts.EmployeeService;
import Hrms.hrmsProject.business.abstracts.EmployeeSocialMediaService;
import Hrms.hrmsProject.business.abstracts.EmployeeTechnologyService;
import Hrms.hrmsProject.business.abstracts.MernisCheckService;
import Hrms.hrmsProject.core.utilities.adapters.MernisAdapterService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.ErrorResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeeDao;
import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.dtos.CvDetailDto;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	private MernisCheckService checkEmployee;
	private EmployeeEducationService employeeEducationService;
	private EmployeeExperienceService employeeExperienceService;
	private EmployeeLanguageService employeeLanguageService;
	private EmployeeTechnologyService employeeTechnologyService;
	private EmployeeSocialMediaService employeeSocialMediaService;
	private EmployeePhotoService employeePhotoService;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao, EmployeeEducationService employeeEducationService,
			EmployeeExperienceService employeeExperienceService, EmployeeLanguageService employeeLanguageService,
			EmployeeTechnologyService employeeTechnologyService, EmployeeSocialMediaService employeeSocialMediaService,
			EmployeePhotoService employeePhotoService) {
		super();
		this.employeeDao = employeeDao;
		this.checkEmployee = new MernisAdapterService();
		this.employeeEducationService = employeeEducationService;
		this.employeeExperienceService = employeeExperienceService;
		this.employeeLanguageService = employeeLanguageService;
		this.employeeTechnologyService = employeeTechnologyService;
		this.employeeSocialMediaService = employeeSocialMediaService;
		this.employeePhotoService = employeePhotoService;
	}

	@Override
	public Result add(Employee employee) {

		this.employeeDao.save(employee);
		return new SuccessResult("Kullanıcı eklendi.");

	}

	@Override
	public DataResult<List<Employee>> getAll() {

		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "Listelendi.");
	}

	@Override
	public Result isEmployeeMailExist(String mail) {

		if (employeeDao.findByMailContaining(mail).isEmpty()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu mail ile kayıtlı kullanıcı var.");
		}

	}

	@Override
	public Result isNationalityIdExist(String nationalityId) {

		if (employeeDao.findByNationalityIdContaining(nationalityId).isEmpty()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu Tc kimlik no ile kayıtlı kullanıcı var.");
		}
	}

	@Override
	public DataResult<CvDetailDto> getDetailByEmployeeCv(int employeeId) {

		CvDetailDto cvDetailDto = new CvDetailDto();
		cvDetailDto.setEmployee(this.employeeDao.findById(employeeId).get());
		cvDetailDto.setEmployeeEducations(this.employeeEducationService.findByEmployee_Id(employeeId).getData());
		cvDetailDto.setEmployeeExperiences(this.employeeExperienceService.findByEmployee_Id(employeeId).getData());
		cvDetailDto.setEmployeeLanguages(this.employeeLanguageService.findByEmployee_Id(employeeId).getData());
		cvDetailDto.setEmployeePhotos(this.employeePhotoService.findByEmployee_Id(employeeId).getData());
		cvDetailDto.setEmployeeSocialMedias(this.employeeSocialMediaService.findByEmployee_Id(employeeId).getData());
		cvDetailDto.setEmployeeTechnologies(this.employeeTechnologyService.findByEmployee_Id(employeeId).getData());
		return new SuccessDataResult<CvDetailDto>(cvDetailDto, "Cv detayı listelendi.");
 
	}

	@Override
	public DataResult<List<Employee>> findByEmployeeId(int employeeId) {

		// return new
		// SuccessDataResult<List<Employee>>(employeeDao.findById(employeeId));
		return null;
	}

}

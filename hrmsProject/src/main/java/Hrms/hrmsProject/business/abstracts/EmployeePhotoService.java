package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.EmployeeLanguage;
import Hrms.hrmsProject.entities.concretes.EmployeePhoto;

public interface EmployeePhotoService {

	Result add(EmployeePhoto employeePhoto);
	Result update(EmployeePhoto employeePhoto);
	Result addCloudinary(EmployeePhoto employeePhoto,MultipartFile file);
	DataResult<List<EmployeePhoto>> getAll();
	DataResult<List<EmployeePhoto>> findByEmployee_Id(int employeeId);
}

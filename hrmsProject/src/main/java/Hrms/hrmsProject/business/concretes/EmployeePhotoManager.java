package Hrms.hrmsProject.business.concretes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Hrms.hrmsProject.business.abstracts.EmployeePhotoService;
import Hrms.hrmsProject.core.utilities.cloudinary.ImageService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeePhotoDao;
import Hrms.hrmsProject.entities.concretes.EmployeePhoto;

@Service
public class EmployeePhotoManager implements EmployeePhotoService {

	private EmployeePhotoDao employeePhotoDao;
	private ImageService imageService;
	
	@Autowired
	public EmployeePhotoManager(EmployeePhotoDao employeePhotoDao,ImageService imageService) {
		super();
		this.employeePhotoDao = employeePhotoDao;
		this.imageService=imageService;
	}

	@Override
	public Result add(EmployeePhoto employeePhoto) {
		employeePhotoDao.save(employeePhoto);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeePhoto>> getAll() {
		
		return new SuccessDataResult<List<EmployeePhoto>>(employeePhotoDao.findAll());
	}

	@Override
	public Result addCloudinary(EmployeePhoto employeePhoto, MultipartFile file) {
		  Map<String, String> result = (Map<String, String>) this.imageService.save(file).getData();
	        String url = result.get("url");
	        employeePhoto.setPhotoLink(url);
	        employeePhoto.setUploadedDate(LocalDateTime.now());
	       add(employeePhoto);
	       return new SuccessResult("Fotoğraf başarıyla yüklendi.");
	}

	@Override
	public DataResult<List<EmployeePhoto>> findByEmployee_Id(int employeeId) {
		
		return new SuccessDataResult<List<EmployeePhoto>>(employeePhotoDao.findByEmployee_Id(employeeId));
	}

	@Override
	public Result update(EmployeePhoto employeePhoto) {
	 EmployeePhoto updatePhoto=employeePhotoDao.findById(employeePhoto.getId()).orElse(null);
	 updatePhoto.setId(employeePhoto.getId());
	 updatePhoto.setEmployee(employeePhoto.getEmployee());
	 updatePhoto.setPhotoLink(employeePhoto.getPhotoLink());
	 updatePhoto.setPreface(employeePhoto.getPreface());
	 updatePhoto.setUploadedDate(employeePhoto.getUploadedDate());
	 employeePhotoDao.save(updatePhoto);
		return new SuccessResult("Güncelleme başarılı.");
	}

}

package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.SocialMediaTypeService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.SocialMediaTypeDao;
import Hrms.hrmsProject.entities.concretes.SocialMediaType;

@Service
public class SocialMediaTypeManager implements SocialMediaTypeService {

	private SocialMediaTypeDao socialMediaDao;
	
	@Autowired
	public SocialMediaTypeManager(SocialMediaTypeDao socialMediaDao) {
		super();
		this.socialMediaDao = socialMediaDao;
	}

	@Override
	public Result add(SocialMediaType socialMedia) {
		socialMediaDao.save(socialMedia);
		return new SuccessResult("Sosyal medya hesabı eklendi.");
	}

	@Override
	public DataResult<List<SocialMediaType>> getAll() {
	 
		return new SuccessDataResult<List<SocialMediaType>>(socialMediaDao.findAll(),"Sosyal medya hesapları listelendi.");
	}

}

package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.SocialMediaLinkService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.SocialMediaLinkDao;
import Hrms.hrmsProject.entities.concretes.SocialMediaLink;

@Service
public class SocialMediaLinkManager implements SocialMediaLinkService {

	private SocialMediaLinkDao socialMediaLinkDao;
	
	@Autowired
	public SocialMediaLinkManager(SocialMediaLinkDao socialMediaLinkDao) {
		super();
		this.socialMediaLinkDao = socialMediaLinkDao;
	}

	@Override
	public Result add(SocialMediaLink socialMediaLink) {
		 socialMediaLinkDao.save(socialMediaLink);
		return new SuccessResult("Sosyal medya linki eklendi.");
	}

	@Override
	public DataResult<List<SocialMediaLink>> getAll() {
		 
		return new SuccessDataResult<List<SocialMediaLink>>(socialMediaLinkDao.findAll(),"Sosyal medya linkleri listelendi.");
	}

}

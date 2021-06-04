package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.SocialMediaLink;

public interface SocialMediaLinkService {

	Result add(SocialMediaLink socialMediaLink);
	DataResult<List<SocialMediaLink>> getAll();
}

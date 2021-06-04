package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.SocialMediaType;

public interface SocialMediaTypeService {

	Result add(SocialMediaType socialMedia);
	DataResult<List<SocialMediaType>> getAll();
}

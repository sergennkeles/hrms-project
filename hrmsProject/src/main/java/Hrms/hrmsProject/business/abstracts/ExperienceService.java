package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Experience;

public interface ExperienceService {

	Result add(Experience experience);
	DataResult<List<Experience>> getAll();
}

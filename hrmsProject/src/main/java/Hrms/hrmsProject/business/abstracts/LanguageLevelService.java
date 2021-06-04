package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.LanguageLevel;

public interface LanguageLevelService {

	Result add(LanguageLevel languageLevel);
	DataResult<List<LanguageLevel>> getAll();
	
}

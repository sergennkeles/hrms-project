package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.LanguageLevelService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.LanguageLevelDao;
import Hrms.hrmsProject.entities.concretes.LanguageLevel;

@Service
public class LanguageLevelManager implements LanguageLevelService {

	private LanguageLevelDao languageLevelDao;
	
	@Autowired
	public LanguageLevelManager(LanguageLevelDao languageLevelDao) {
		super();
		this.languageLevelDao = languageLevelDao;
	}

	@Override
	public Result add(LanguageLevel languageLevel) {
		 languageLevelDao.save(languageLevel);
		return new SuccessResult("Dil seviyesi eklendi.");
	}

	@Override
	public DataResult<List<LanguageLevel>> getAll() {
		 
		return new SuccessDataResult<List<LanguageLevel>>(languageLevelDao.findAll(),"Dil seviyeleri listelendi.");
	}

}

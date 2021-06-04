package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.TechnologyService;
import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessDataResult;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.TechnologyDao;
import Hrms.hrmsProject.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyDao technologyDao;
	
	@Autowired
	public TechnologyManager(TechnologyDao technologyDao) {
		super();
		this.technologyDao = technologyDao;
	}

	@Override
	public Result add(Technology technology) {
		 technologyDao.save(technology);
		return new SuccessResult("Teknoloji eklendi.");
	}

	@Override
	public DataResult<List<Technology>> getAll() {
	 
		return new SuccessDataResult<List<Technology>>(technologyDao.findAll(),"Teknolojiler listelendi.");
	}

}

package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Employer;

public interface EmployerService {

	
	DataResult<List<Employer>>  getAll();
	Result add(Employer employer);
	
}

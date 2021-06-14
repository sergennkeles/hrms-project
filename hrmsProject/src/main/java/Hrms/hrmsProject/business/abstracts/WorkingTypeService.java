package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.WorkingType;

public interface WorkingTypeService {

	Result add(WorkingType workingType);
	DataResult<List<WorkingType>> getAll();
}

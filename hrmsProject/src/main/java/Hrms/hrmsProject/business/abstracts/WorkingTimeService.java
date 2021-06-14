package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.WorkingTime;

public interface WorkingTimeService {

	Result add(WorkingTime  workingTime);
	DataResult<List<WorkingTime>> getAll();
}

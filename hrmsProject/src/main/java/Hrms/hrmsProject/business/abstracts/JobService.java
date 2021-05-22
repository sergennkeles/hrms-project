package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.core.utilities.results.DataResult;
import Hrms.hrmsProject.entities.concretes.Job;

public interface JobService {

	DataResult<List<Job>> getAll();
}

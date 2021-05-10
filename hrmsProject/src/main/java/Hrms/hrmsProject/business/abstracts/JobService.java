package Hrms.hrmsProject.business.abstracts;

import java.util.List;

import Hrms.hrmsProject.entities.concretes.Job;

public interface JobService {

	List<Job> getAll();
}

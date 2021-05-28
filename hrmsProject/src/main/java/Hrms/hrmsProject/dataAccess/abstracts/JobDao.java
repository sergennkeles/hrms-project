package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

	List<Job> findByJobsNameContaining(String jobName);
}

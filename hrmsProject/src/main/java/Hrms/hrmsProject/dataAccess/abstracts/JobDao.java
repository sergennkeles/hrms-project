package Hrms.hrmsProject.dataAccess.abstracts;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

	Optional<Job> findByJobsName(String jobName);
}

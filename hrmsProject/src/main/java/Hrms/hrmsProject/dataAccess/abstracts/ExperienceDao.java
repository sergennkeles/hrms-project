package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {

}

package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {

}

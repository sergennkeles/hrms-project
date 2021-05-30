package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import Hrms.hrmsProject.entities.concretes.VerificationEmployer;

public interface VerificationEmployerDao extends JpaRepository<VerificationEmployer, Integer> {

}

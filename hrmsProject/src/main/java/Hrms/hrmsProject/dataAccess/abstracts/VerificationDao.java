package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Verification;

public interface VerificationDao extends JpaRepository<Verification, Integer> {

}

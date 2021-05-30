package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.VerificationEmployee;

public interface VerificationEmployeeDao extends JpaRepository<VerificationEmployee, Integer>  {

}

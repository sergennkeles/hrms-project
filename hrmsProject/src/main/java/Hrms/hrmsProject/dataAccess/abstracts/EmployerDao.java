package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}

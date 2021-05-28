package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Employer;
import Hrms.hrmsProject.entities.concretes.User;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

	List<User> findByMailContaining(String mail);
}

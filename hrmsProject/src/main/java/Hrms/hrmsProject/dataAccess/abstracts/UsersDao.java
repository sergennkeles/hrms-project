package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.User;

public interface UsersDao extends JpaRepository<User, Integer> {

	
	
}

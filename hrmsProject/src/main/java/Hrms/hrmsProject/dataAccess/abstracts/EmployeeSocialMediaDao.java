package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeeSocialMedia;

public interface EmployeeSocialMediaDao extends JpaRepository<EmployeeSocialMedia, Integer> {

}

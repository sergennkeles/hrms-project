package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

}

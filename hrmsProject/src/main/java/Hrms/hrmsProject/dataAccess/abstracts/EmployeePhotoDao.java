package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.EmployeePhoto;

public interface EmployeePhotoDao extends JpaRepository<EmployeePhoto, Integer> {

}

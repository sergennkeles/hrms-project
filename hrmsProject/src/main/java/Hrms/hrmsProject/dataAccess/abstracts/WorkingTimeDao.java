package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.WorkingTime;

public interface WorkingTimeDao extends JpaRepository<WorkingTime, Integer> {

}

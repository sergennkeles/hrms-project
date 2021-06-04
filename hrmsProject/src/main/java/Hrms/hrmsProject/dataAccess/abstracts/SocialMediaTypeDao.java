package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.SocialMediaType;

public interface SocialMediaTypeDao extends JpaRepository<SocialMediaType, Integer> {

}

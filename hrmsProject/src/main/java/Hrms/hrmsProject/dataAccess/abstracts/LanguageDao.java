package Hrms.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrmsProject.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {

}

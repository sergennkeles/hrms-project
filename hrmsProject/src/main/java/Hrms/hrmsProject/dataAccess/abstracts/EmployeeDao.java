package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.concretes.User;
import Hrms.hrmsProject.entities.dtos.CvDetailDto;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	List<User> findByMailContaining(String mail);

	List<Employee> findByNationalityIdContaining(String nationalityId);
	// List<Employee> findById(int employeeId);

	/*
	 * @Query("Select new Hrms.hrmsProject.entities.dtos.CvDetailDto(" +
	 * "employe.id, " + "employe.firstName," + "employe.lastName," +
	 * "sch.schoolName," + "dep.departmentName," + "edu.startDate," + "edu.endDate "
	 * + "lng.languageName, " + "lnglvl.languageLevelName," + "exper.companyName," +
	 * "exper.departmentName," + "exper.startDate," + "exper.endDate" +
	 * "soctype.socialMediaType," + "soclink.socialMediaLink," +
	 * "techo.technologyName, " + "emppho.photo)" + "from employee_educations emp "
	 * + "inner join Employee employe on emp.employee_id=employe.id" +
	 * "inner join EmloyeeLanguage emplng on emp.employee_id=emplng.employee_id" +
	 * "inner join EmployeeExperience empexp on emp.employee_id=empexp.employee_id"
	 * + "inner join EmployeePhoto emppho on emp.employee_id=emppho.employee_id" +
	 * "inner join EmployeeSocialMedia empsoc on emp.employee_id=empsoc.employee_id "
	 * +
	 * "inner join EmployeeTechnology emptech on emp.employee_id=emptech.employee_id"
	 * + "inner join LanguageLevel lnglvl on emplng.language_level_id=lnglvl.id" +
	 * "inner join Education edu on emp.education_id=edu.id" +
	 * "inner join School sch on edu.school_id=sch.id" +
	 * "inner join Department dep on edu.department_id=dep.id" +
	 * "inner join Language lng on emplng.language_id=lng.id" +
	 * "inner join Experience exper on empexp.experience_id=exper.id" +
	 * "inner join SocialMediaLink soclink on empsoc.social_media_link_id=soclink.id"
	 * +
	 * "inner join SocialMediaType soctype on soclink.social_media_type=soctype.id"
	 * + "inner join Technology techno on emptech.technology_id=techno.id"
	 * 
	 * ) List<CvDetailDto> getDetailByEmployeeCv();
	 */

}

package Hrms.hrmsProject.entities.dtos;

import java.util.Date;
import java.util.List;

import Hrms.hrmsProject.entities.concretes.Employee;
import Hrms.hrmsProject.entities.concretes.EmployeeEducation;
import Hrms.hrmsProject.entities.concretes.EmployeeExperience;
import Hrms.hrmsProject.entities.concretes.EmployeeLanguage;
import Hrms.hrmsProject.entities.concretes.EmployeePhoto;
import Hrms.hrmsProject.entities.concretes.EmployeeSocialMedia;
import Hrms.hrmsProject.entities.concretes.EmployeeTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvDetailDto {

//	private int employeeId;
//	private String firstName;
//	private String lastName;
//	private String schoolName;
//	private String departmentName;
//	private Date educationStartDate;
//	private Date educationEndDate;
//	private String languageName;
//	private String languageLevelName;
//	private String companyName;
//	private String experienceDepartmentName;
//	private Date experienceStartDate;
//	private Date experienceEndDate;
//	private String socialMediaType;
//	private String socialMediaLink;
//	private String technologyName;
//	private String photo;

	private Employee employee;
	private List<EmployeeEducation> employeeEducations;
	private List<EmployeeExperience> employeeExperiences;
	private List<EmployeeLanguage> employeeLanguages;
	private List<EmployeeSocialMedia> employeeSocialMedias;
	private List<EmployeeTechnology> employeeTechnologies;
	private List<EmployeePhoto> employeePhotos;

}

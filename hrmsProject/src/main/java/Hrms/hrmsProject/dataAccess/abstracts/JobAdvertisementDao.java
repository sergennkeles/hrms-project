package Hrms.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Hrms.hrmsProject.entities.concretes.JobAdvertisement;
import Hrms.hrmsProject.entities.dtos.JobAdvertisementDto;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	List<JobAdvertisement> findByIsActiveTrue();
	

	List<JobAdvertisement> findByIsActiveTrueOrderByCreatedDateDesc();

	List<JobAdvertisement> findByIsActiveTrueAndEmployerId(int employerId);

//	@Query("Select New Hrms.hrmsProject.entities.dtos.JobAdvertisementDto()"
//			+ " From JobAdvertisement j Inner Join City c on j.city_id=c.id Inner Join Employer e on j.employer_id=e.id Inner Join Job jo on j.job_id=jo.id ")
//	@Query("Select New Hrms.hrmsProject.entities.dtos.JobAdvertisementDto(j.id,j.description,j.minSalary,j.maxSalary,j.createdDate,j.deadLineDate,j.openPositionNumber,c.cityName)"
//			+ " From JobAdvertisement j Inner Join j.city c ")
	@Query("select new Hrms.hrmsProject.entities.dtos.JobAdvertisementDto(j.description,j.minSalary,j.maxSalary,wti.workingTime,wty.workingType,j.createdDate,j.deadLineDate,j.openPositionNumber,jo.jobsName, e.companyName,c.cityName) "
			+ "from JobAdvertisement j inner join j.employer e inner join j.job jo inner join j.city c inner join j.workingTime wti inner join j.workingType wty where j.isActive=true")
	List<JobAdvertisementDto> getJobAdvertisementWithDetails();
}

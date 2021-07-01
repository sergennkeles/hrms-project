package Hrms.hrmsProject.entities.dtos;


import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

    private int advertisementId;
	private String description;
	private double minSalary;
	private double maxSalary;
	private String workingTime;
	private String workingType;
	private Date createdDate;
	private Date deadLineDate;
	private int openPositionNumber;
	private String jobsName;
	private String companyName;
	private String cityName;
	
	
}

package Hrms.hrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employers")
public class Employer extends User {


	@Column(name = "jobs_id")
	private int jobsId;
	
	@NotBlank(message = "Şirket adı alanı boş geçilemez.")
	@Column(name = "company_name")
	private String companyName;
	
	@NotBlank(message = "Websitesi alanı boş geçilemez.")
	@Column(name = "web_site")
	private String webSite;
	
	@NotBlank(message = "Telefon alanı boş geçilemez.")
	@Column(name = "phone_number")
	private String phoneNumber;
}

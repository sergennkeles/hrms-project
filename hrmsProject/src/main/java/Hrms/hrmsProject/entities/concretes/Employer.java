package Hrms.hrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobadvertisements"})
public class Employer extends User {


	@NotBlank(message = "Şirket adı alanı boş geçilemez.")
	@Column(name = "company_name")
	private String companyName;
	
	@NotBlank(message = "Websitesi alanı boş geçilemez.")
	@Column(name = "web_site")
	private String webSite;
	
	@NotBlank(message = "Telefon alanı boş geçilemez.")
	@Column(name = "phone_number")
	private String phoneNumber;
	
	
	 @OneToMany(mappedBy = "employer")
	 @JsonIgnore
	 private List<JobAdvertisement> jobadvertisements;
}

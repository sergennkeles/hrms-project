package Hrms.hrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "jobs")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobadvertisements"})
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank(message = "Meslek adı alanı boş geçilemez.")
	@Column(name = "jobs_name")
	private String jobsName;
	
	@NotBlank(message = "Meslek kategorisi alanı boş geçilemez.")
	@Column(name = "jobs_category")
	private String jobsCategory;

	 @OneToMany(mappedBy = "job")
	 @JsonIgnore
	 private List<JobAdvertisement> jobadvertisements;
}

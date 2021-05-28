package Hrms.hrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "jobs")
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


}

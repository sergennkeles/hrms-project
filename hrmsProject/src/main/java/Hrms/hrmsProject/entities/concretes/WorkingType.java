package Hrms.hrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "working_types")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobadvertisements"})
public class WorkingType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	 
	@Column(name = "working_type")
	private String workingType;
	
	 @OneToMany(mappedBy = "workingType")
	 @JsonIgnore
	 private List<JobAdvertisement> jobadvertisements;
}

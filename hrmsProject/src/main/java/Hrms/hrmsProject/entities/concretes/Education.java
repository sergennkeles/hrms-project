package Hrms.hrmsProject.entities.concretes;

import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "educations")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employeeEducations"})
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	

//	@Column(name = "school_name_id")
//	private int schoolNameId;
//	
//	@Column(name = "department_name_id")
//	private int departmentNameId;
	
	@ManyToOne
	@JoinColumn(name = "school")
	private School school;
	
	@ManyToOne
	@JoinColumn(name = "department")
	private Department department;
	
	@JsonIgnore
	@OneToMany(mappedBy = "education")
	private List<EmployeeEducation> employeeEducations;
	
	
}

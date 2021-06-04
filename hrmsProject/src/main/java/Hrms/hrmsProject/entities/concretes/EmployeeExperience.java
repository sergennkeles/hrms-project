package Hrms.hrmsProject.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employee_experiences")
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name = "employee_id")
//	private int employeeId;
//	
//	@Column(name = "experience_id")
//	private int experienceId;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
    private Employee employee;
	
	@ManyToOne
	@JoinColumn(name = "experience_id")
	private Experience experience;
}

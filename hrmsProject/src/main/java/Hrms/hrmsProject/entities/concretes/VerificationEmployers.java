package Hrms.hrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="verification_employers")
public class VerificationEmployers {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "employer_id")
	private int employerId;
}

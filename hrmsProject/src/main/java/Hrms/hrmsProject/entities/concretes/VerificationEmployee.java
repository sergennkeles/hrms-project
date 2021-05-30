package Hrms.hrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="verification_employees")
public class VerificationEmployee extends Verification {


	
	@Column(name = "employee_id")
	private int employeeId;
		
	public VerificationEmployee(int id, String verificationCode, LocalDate dateOfRegistration, int employeeId) {
		super(id,verificationCode,dateOfRegistration);
		this.employeeId = employeeId;
	}
	
//	
//	@OneToOne(mappedBy = "verification_employers")
//	private VerificationEmployer verificationEmployer;
}

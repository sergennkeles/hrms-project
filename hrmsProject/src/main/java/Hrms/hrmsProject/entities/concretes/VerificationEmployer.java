package Hrms.hrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name="verification_employers")
public class VerificationEmployer extends Verification {

	
	
	@Column(name = "employer_id")
	private int employerId;

	public VerificationEmployer(int id, String verificationCode, boolean isVerified, LocalDate dateOfRegistration, int employerId) {
		super(id,verificationCode,isVerified,dateOfRegistration);
		this.employerId = employerId;
	}
	
//	@OneToOne(mappedBy = "verification_employees")
//	private VerificationEmployee verificationEmployee;
}

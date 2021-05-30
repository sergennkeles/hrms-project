package Hrms.hrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@Table(name="verifications")
public class Verification {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	
	@Column(name = "verification_code")
	private String verificationCode;
	
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name="date_of_registration", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate dateOfRegistration = LocalDate.now();
	
//	@OneToOne
//	@JoinColumn(name = "id")
//	private VerificationEmployee employee;
//	
//	@OneToOne
//	@JoinColumn(name = "id")
//	private VerificationEmployer employer;
}

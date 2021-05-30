package Hrms.hrmsProject.entities.concretes;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name = "employees")
public class Employee extends User  {

	@NotBlank(message = "Tc kimlik no alanı boş geçilemez.")
	@Column(name = "nationality_id")
	private String nationalityId;
	
	@NotBlank(message = "Ad alanı boş geçilemez.")
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank(message = "Soyad alanı boş geçilemez.")
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank(message = "Doğum tarihi alanı boş geçilemez.")
	@Column(name = "birthday")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date birthDay;
}

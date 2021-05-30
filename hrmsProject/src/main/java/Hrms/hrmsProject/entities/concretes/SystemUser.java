package Hrms.hrmsProject.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "system_users")

public class SystemUser extends User {
	
	@NotBlank(message = "Ad alanı boş geçilemez.")
	@Column(name ="first_name" )
	private String firstName;
	
	@NotBlank(message = "Soyad alanı boş geçilemez.")
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank(message = "Unvan alanı boş geçilemez.")
	@Column(name = "title")
	private String title;
	
}

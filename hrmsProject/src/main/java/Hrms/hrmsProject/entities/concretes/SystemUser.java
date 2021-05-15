package Hrms.hrmsProject.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "system_users")

public class SystemUser extends User {
	

	@Column(name ="first_name" )
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "title")
	private String title;
	
}

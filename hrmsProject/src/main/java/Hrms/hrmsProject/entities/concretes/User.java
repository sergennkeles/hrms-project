package Hrms.hrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name ="id" )
	private int id;
	
	@Column(name = "mail", unique =true )
	private String mail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "confirm")
	private boolean confirm;
	

}

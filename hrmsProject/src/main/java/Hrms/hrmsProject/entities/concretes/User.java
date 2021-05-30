package Hrms.hrmsProject.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;


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
	
	@NotBlank(message = "Mail alanı boş geçilemez.")
	@Column(name = "mail")
	private String mail;
	
	@NotBlank(message = "Şifre alanı boş geçilemez.")
	@Column(name = "password")
	private String password;
	
	@Transient
	private String repeatPassword;
//	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//	@Column(name= "created_at", columnDefinition = "Date defult CURRENT_DATE")
//	private LocalDate createdAt = LocalDate.now();
//	
//	@Column(name= "is_active", columnDefinition = "boolean default true")
//	private boolean isActive = true;
//	
//	@Column(name= "is_deleted", columnDefinition = "boolean default false")
//	private boolean isDeleted = false;

}

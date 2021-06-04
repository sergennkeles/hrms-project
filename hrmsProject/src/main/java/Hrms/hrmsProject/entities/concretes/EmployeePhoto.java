package Hrms.hrmsProject.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employee_photos")
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePhoto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	//@Column(name = "employee_id")
	//private int employeeId;
	
	@ManyToOne()
	@JsonIgnore()
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name = "photo_link")
	private String photoLink;
	
	@Column(name="uploaded_date")
    private LocalDateTime uploadedDate;
}

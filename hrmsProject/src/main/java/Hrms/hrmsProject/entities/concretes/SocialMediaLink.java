package Hrms.hrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "social_media_links")
@NoArgsConstructor
@AllArgsConstructor
public class SocialMediaLink {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
//	
//	@Column(name = "social_media_type_id")
//	private int socialMediaTypeId;
//	
	@Column(name = "social_media_link")
	private String socialMediaLink;
	
	@ManyToOne
	@JoinColumn(name = "social_media_type_id")
	private SocialMediaType socialMediaType;
	
//	@OneToMany(mappedBy = "social_media")
//	private List<EmployeeSocialMedia> employeeSocialMedias;
	

}

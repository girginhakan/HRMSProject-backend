package kodlamaio.hrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
//@PrimaryKeyJoinColumn(name = "employer_id")
@EqualsAndHashCode(callSuper = true)
public class Employer extends User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "employer_id")
//	private int employerId;

	@NotBlank
	@NotNull(message = "required")
	@Column(name = "company_name", nullable = false)
	private String companyName;

	@NotBlank
	@NotNull(message = "required")
	@Column(name = "web_address", nullable = false)
	private String webAddress;

	@NotBlank
	@NotNull(message = "required")
	@Pattern(regexp = "[0-9\\s]{12}")
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	@OneToMany(mappedBy = "employer",cascade = CascadeType.ALL)
	private List<JobPosting> jobPostings;
	
	
	
	

}

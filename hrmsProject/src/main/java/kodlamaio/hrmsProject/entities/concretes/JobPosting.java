package kodlamaio.hrmsProject.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_postings")
@AllArgsConstructor
@NoArgsConstructor

public class JobPosting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name = "job_description",nullable = false)
	private String jobDescription;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name="min_salary",nullable = false)
	private int minSalary;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name="max_salary", nullable = false)
	private int maxSalary;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name="number_of_open_positions",nullable = false)
	private int numberOfOpenPositions;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name="posting_date",nullable = false)
	private Date postingDate;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name="closing_date",nullable = false)
	private Date closingDate;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name="is_active")
	private Boolean isActive;
	
	
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="job_title_id")
	private JobTitle jobTitle;

	

}

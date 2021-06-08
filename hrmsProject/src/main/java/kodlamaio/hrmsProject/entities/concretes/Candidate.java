package kodlamaio.hrmsProject.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapsId;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "candidates")
@AllArgsConstructor
@NoArgsConstructor


@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="candidate_id")


public class Candidate extends User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "candidate_id")
//	private int candidateId;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name = "identification_number")
	private String identificationNumber;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name = "birth_date")
	private int birthDate;
	
	
}


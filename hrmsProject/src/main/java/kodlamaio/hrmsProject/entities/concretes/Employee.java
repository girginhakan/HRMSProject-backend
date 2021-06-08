package kodlamaio.hrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")


@PrimaryKeyJoinColumn(name = "employee_id")
@EqualsAndHashCode(callSuper = true)

public class Employee extends User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "employee_id")
//	private int employeeId;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank
	@NotNull(message = "required")
	@Column(name = "last_name")
	private String lastName;

}

package kodlamaio.hrmsProject.entities.dtos;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingWithEmployerAndJobTitleDto {
	
	private String companyName;
	private String title;
	private int numberOfOpenPositions;
	private Date postingDate;
	private Date closingDate;
	private boolean isActive;
}

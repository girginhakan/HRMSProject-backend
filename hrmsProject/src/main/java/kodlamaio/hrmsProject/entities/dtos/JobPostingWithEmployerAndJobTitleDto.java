package kodlamaio.hrmsProject.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingWithEmployerAndJobTitleDto {
	
//	public JobPostingWithEmployerAndJobTitleDto(String companyName,int numberOfOpenPositions,Date postingDate,Date closingDate,Boolean isActive ){
//		
//		this.companyName=companyName;
//		this.numberOfOpenPositions=numberOfOpenPositions;
//		this.postingDate=postingDate;
//		this.closingDate=closingDate;
//		this.isActive=isActive;
//	}
	private String companyName;
	private String title;
	private int numberOfOpenPositions;
	private Date postingDate;
	private Date closingDate;
	private Boolean isActive;
}

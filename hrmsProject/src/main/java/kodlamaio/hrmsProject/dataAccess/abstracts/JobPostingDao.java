package kodlamaio.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsProject.entities.concretes.JobPosting;
import kodlamaio.hrmsProject.entities.dtos.JobPostingWithEmployerAndJobTitleDto;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {

	@Query("Select new kodlamaio.hrmsProject.entities.dtos.JobPostingWithEmployerAndJobTitleDto"
			+ "(e.companyName,jt.title, jp.numberOfOpenPositions, jp.postingDate, jp.closingDate, jp.isActive) "
			+ "From Employer e "
			+ "Inner Join e.jobPostings jp "
			+ "Inner Join jp.jobTitle jt")
	List<JobPostingWithEmployerAndJobTitleDto> getJobPostingWithEmployerAndJobTitleDetailsByIsActive(boolean isActive);

	@Query("Select new kodlamaio.hrmsProject.entities.dtos.JobPostingWithEmployerAndJobTitleDto"
			+ "( e.companyName,jt.title, jp.numberOfOpenPositions, jp.postingDate, jp.closingDate, jp.isActive) "
			+ "From Employer e "
			+ "Inner Join e.jobPostings jp "
			+ "Inner Join jp.jobTitle jt")
	List<JobPostingWithEmployerAndJobTitleDto> getJobPostingWithEmployerAndJobTitleDetailsByIsActive(boolean isActive,
			Sort sort);

	@Query("Select new kodlamaio.hrmsProject.entities.dtos.JobPostingWithEmployerAndJobTitleDto"
			+ "(e.companyName,jt.title, jp.numberOfOpenPositions, jp.postingDate, jp.closingDate, jp.isActive) "
			+ "From Employer e "
			+ "Inner Join e.jobPostings jp "
			+ "Inner Join jp.jobTitle jt")
	List<JobPostingWithEmployerAndJobTitleDto> getJobPostingWithEmployerAndJobTitleDetailsByIsActiveAndEmployer_EmployerId(
			boolean isActive, int employerId);

}

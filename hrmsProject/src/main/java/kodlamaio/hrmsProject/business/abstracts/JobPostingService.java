package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.JobPosting;
import kodlamaio.hrmsProject.entities.dtos.JobPostingWithEmployerAndJobTitleDto;

public interface JobPostingService {
	Result add(JobPosting jobPosting);

	

	Result delete(JobPosting jobPosting);

	DataResult<List<JobPosting>> getAll(); 

	

	DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetails();

	DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetailsSortedByPostingDate();

	DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetailsByEmployerId(int employerId);
}

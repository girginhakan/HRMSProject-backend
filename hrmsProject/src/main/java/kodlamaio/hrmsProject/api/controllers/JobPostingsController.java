package kodlamaio.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.JobPostingService;
import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.JobPosting;
import kodlamaio.hrmsProject.entities.dtos.JobPostingWithEmployerAndJobTitleDto;

@RestController
@RequestMapping("/api/jobPostings")
public class JobPostingsController {
	private JobPostingService jobPostingService;
	@Autowired
	public JobPostingsController(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.delete(jobPosting);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobPosting>> getAll(){
		return this.jobPostingService.getAll();
	}
	
	@GetMapping("/getActiveJobPostingDetails")
	public DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetails(){
		return this.jobPostingService.getActiveJobPostingDetails();
	}
	
	@GetMapping("getActiveJobPostingDetailsSortedByPostingDate")
	public DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetailsSortedByPostingDate(){
		return this.jobPostingService.getActiveJobPostingDetailsSortedByPostingDate();
	}
	
	@GetMapping("/getActiveJobPostingDetailsByEmployerId")
	public DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetailsByEmployerId(int id){
		return this.jobPostingService.getActiveJobPostingDetailsByEmployerId(id);
	}
}

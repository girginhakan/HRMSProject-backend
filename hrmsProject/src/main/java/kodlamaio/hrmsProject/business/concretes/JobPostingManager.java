package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.JobPostingService;
import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrmsProject.entities.concretes.JobPosting;
import kodlamaio.hrmsProject.entities.dtos.JobPostingWithEmployerAndJobTitleDto;
@Service
public class JobPostingManager implements JobPostingService {

	private JobPostingDao jobPostingDao;
	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		
		this.jobPostingDao = jobPostingDao;
	}

	@Override
	public Result add(JobPosting jobPosting) {
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("İş ilanı başarıyla eklendi");
	}

	

	@Override
	public Result delete(JobPosting jobPosting) {
		this.jobPostingDao.delete(jobPosting);
		return new SuccessResult("İş ilanı başarıyla silindi.");
	}

	@Override
	public DataResult<List<JobPosting>> getAll() {
		
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(), "Tüm iş ilanları başarıyla listelendi");
	}


	@Override
	public DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetails() {
		
		return new SuccessDataResult<List<JobPostingWithEmployerAndJobTitleDto>>(this.jobPostingDao.getJobPostingWithEmployerAndJobTitleDetailsByIsActive(true), "Tüm aktif iş ilanları listelenmiştir.");
	}

	@Override
	public DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetailsSortedByPostingDate() {
		Sort sort=Sort.by(Sort.Direction.DESC, "postingDate");
		return new SuccessDataResult<List<JobPostingWithEmployerAndJobTitleDto>>(this.jobPostingDao.getJobPostingWithEmployerAndJobTitleDetailsByIsActive(true, sort), "Tüm aktif iş ilanları tarihe göre sıralandı.");
	}

	@Override
	public DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetailsByEmployerId(
			int employerId) {
		
		return new SuccessDataResult<List<JobPostingWithEmployerAndJobTitleDto>>(this.jobPostingDao.getJobPostingWithEmployerAndJobTitleDetailsByIsActiveAndEmployer_EmployerId(true, employerId), "Bir firmaya ait tüm aktif iş ilanları listelendi.");
	}

	

}

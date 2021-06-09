package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
//	@Override
//	public DataResult<List<JobPosting>> getAll() {
//		
//		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll());
//	}

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
		
		return new SuccessDataResult<List<JobPostingWithEmployerAndJobTitleDto>>(this.jobPostingDao.getJobPostingWithEmployerAndJobTitleDetailsByIsActive(), "Tüm aktif iş ilanları listelenmiştir.");
	}

	@Override
	public DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetailsSortedByPostingDate() {
		return new SuccessDataResult<List<JobPostingWithEmployerAndJobTitleDto>>(this.jobPostingDao.getJobPostingWithEmployerAndJobTitleDetailsSortedByIsActive(), "Tüm aktif iş ilanları tarihe göre sıralandı.");
	}

	@Override
	public DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getActiveJobPostingDetailsByEmployerId(int id) {
		
		return new SuccessDataResult<List<JobPostingWithEmployerAndJobTitleDto>>(this.jobPostingDao.getJobPostingWithEmployerAndJobTitleDetailsByIsActiveAndEmployer_EmployerId(id), "Bir firmaya ait tüm aktif iş ilanları listelendi.");
	}

	

}

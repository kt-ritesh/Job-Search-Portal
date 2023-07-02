package com.ritesh.Job.Search.Portal.service;

import com.ritesh.Job.Search.Portal.model.Job;
import com.ritesh.Job.Search.Portal.model.JobType;
import com.ritesh.Job.Search.Portal.repository.IJobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    IJobRepo jobRepo;

    public String addJob(Job job) {
        jobRepo.save(job);
        return "new Job Added!";
    }

    public String addJobs(List<Job> jobs) {
        jobRepo.saveAll(jobs);
        return "new jobs added!";
    }

    public Optional<Job> getJobById(Integer id) {
        return jobRepo.findById(id);
    }

    public Iterable<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public Boolean getJobExistsOrNot(Integer id) {
        return jobRepo.existsById(id);
    }

    public long getNoOfJob() {
        return jobRepo.count();
    }

    public String deleteJobById(Integer id) {
        jobRepo.deleteById(id);
        return "job deleted!";
    }

    public String deleteAllJobs() {
        jobRepo.deleteAll();
        return "All jobs deleted!";
    }

    public List<Job> getJobByJobType(JobType type) {
        return jobRepo.findByJobType(type);
    }

    public List<Job> getJobBySalary(Double salary) {
       return jobRepo.findBySalaryGreaterThan(salary);
    }

    public List<Job> getJobByTitle(String title) {
        return jobRepo.findByTitle(title);
    }

    @Transactional
    public String updateSalaryById(Double salary, Long id) {
        jobRepo.setSalaryById(salary, id);
        return "salary updated!";
    }

    @Transactional
    public String updateLocationById(String location, Long id) {
        jobRepo.setLocationById(location, id);
        return "Location updated!";
    }
}

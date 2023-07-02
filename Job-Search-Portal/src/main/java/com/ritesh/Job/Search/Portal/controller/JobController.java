package com.ritesh.Job.Search.Portal.controller;

import com.ritesh.Job.Search.Portal.model.Job;
import com.ritesh.Job.Search.Portal.model.JobType;
import com.ritesh.Job.Search.Portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    // add a job
    @PostMapping("job")
    public String addJob(@RequestBody Job job){
        return jobService.addJob(job);
    }

    // add multiple jobs
    @PostMapping("jobs")
    public String addJobs(@RequestBody List<Job> jobs){
        return jobService.addJobs(jobs);
    }

    // get job by id
    @GetMapping("job/{id}")
    public Optional<Job> getJobById(@PathVariable Integer id){
        return jobService.getJobById(id);
    }

    // get all jobs
    @GetMapping("jobs")
    public Iterable<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    // check job exists or not by id
    @GetMapping("job/{id}/exists")
    public Boolean getJobExistsOrNot(@PathVariable Integer id){
        return jobService.getJobExistsOrNot(id);
    }

    //get total no of jobs
    @GetMapping("job/count")
    public long getNoOfJob(){
        return jobService.getNoOfJob();
    }

    // get job by job Type
    @GetMapping("job/{type}/jobType")
    public List<Job> getJobByJobType(@PathVariable JobType type){
        return jobService.getJobByJobType(type);
    }

    // find the job by salary
    @GetMapping("job/{salary}/salary")
    public List<Job> getJobBySalary(@PathVariable Double salary){
        return jobService.getJobBySalary(salary);
    }

    // find job by title
    @GetMapping("job/{title}/title")
    public List<Job> getJobByTitle(@PathVariable String title){
        return jobService.getJobByTitle(title);
    }

    // update salary by id
    @PutMapping("job/{id}/{salary}")
    public String updateSalaryById(@PathVariable Double salary, @PathVariable Long id){
        return jobService.updateSalaryById(salary, id);
    }

    // update location by id
    @PutMapping("job/location/{location}/{id}")
    public String updateLocationById(@PathVariable String location, @PathVariable Long id){
        return jobService.updateLocationById(location, id);
    }

    // delete job by id
    @DeleteMapping("job/{id}")
    public String deleteJobById(@PathVariable Integer id){
        return jobService.deleteJobById(id);
    }

    // delete all jobs
    @DeleteMapping("jobs")
    public String deleteAllJobs(){
        return jobService.deleteAllJobs();
    }



}

package com.ritesh.Job.Search.Portal.repository;

import com.ritesh.Job.Search.Portal.model.Job;
import com.ritesh.Job.Search.Portal.model.JobType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job, Integer> {
    // find the job using job type
    List<Job> findByJobType(JobType type);
    // find job by salary
    List<Job> findBySalaryGreaterThan(Double salary);

    List<Job> findByTitle(String title);

    @Modifying
    @Query(value = "update job set job.salary = :sal where job.id = :id", nativeQuery = true)
    void setSalaryById(Double sal, Long id);

    @Modifying
    @Query(value = "update job set job.location = :location where job.id=:id", nativeQuery = true)
    void setLocationById(String location, Long id);

}

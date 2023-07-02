package com.ritesh.Job.Search.Portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Job {
    @Id
    private Long id;
    private String title;
    private String description;
    private String location;
    @Min(20000)
    private Double salary;
    private String companyEmail;

    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    private LocalDate appliedDate;
}

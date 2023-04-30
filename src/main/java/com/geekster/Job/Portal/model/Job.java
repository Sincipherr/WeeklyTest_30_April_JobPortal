package com.geekster.Job.Portal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity

public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;
    private String companyName;
    private String employeeName;
    @Enumerated(EnumType.STRING)
    private jobTypes jobType;
    private LocalDateTime appliedDate;
}

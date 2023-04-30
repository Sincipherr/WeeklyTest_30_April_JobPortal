package com.geekster.Job.Portal.service;

import com.geekster.Job.Portal.Repository.IJobRepo;
import com.geekster.Job.Portal.model.Job;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    IJobRepo jr;

    public List<Job> bytitle(String title) {
        return jr.findByTitle(title);
    }

    public String addjob(List<Job> jobList) {
        Iterable<Job> jobs= jr.saveAll(jobList);
        if(jobs!=null){
            return "Added Successfully...!";
        }
        return "Could not add.. Please check the details";
    }

    @Transactional
    public void updatesalary(Double salary, Integer id) {
        jr.updatesalarybyid(salary,id);
    }
    @Transactional
    public List<Job> jobbysalary(String location, Double salary) {
        return jr.findByLocationAndSalaryGreaterThan(location,salary);
    }
 @Transactional
    public void deletejob(Double salary) {
        jr.deletebysalary(salary);
    }

    public List<Job> jobbylocation(String location) {
        return jr.findByLocation(location);
    }
}

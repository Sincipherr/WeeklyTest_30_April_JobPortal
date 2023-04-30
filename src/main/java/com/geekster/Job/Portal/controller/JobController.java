package com.geekster.Job.Portal.controller;

import com.geekster.Job.Portal.model.Job;
import com.geekster.Job.Portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService js;

    @GetMapping(value = "/bytitle/{title}")
    public List<Job> searchbytitle(@PathVariable String title){
        return js.bytitle(title);
    }
    @GetMapping(value = "/locationbysalary/{location}/{salary}")
    public List<Job> jobbylocation(@PathVariable String location,@PathVariable Double salary){
        return js.jobbysalary(location,salary);
    }
    @GetMapping(value = "/bylocation/{location}")
    public List<Job> getbylocation(@PathVariable String location){
        return js.jobbylocation(location);
    }
    @PostMapping(value = "/addjob")
    public String addjob(@RequestBody List<Job> jobList){
       return js.addjob(jobList);
    }

    @PutMapping(value = "/updatesalary/{salary}/{id}")
    public void updatesalary(@PathVariable Double salary,@PathVariable Integer id){
        js.updatesalary(salary,id);
    }

    @DeleteMapping(value = "/deletejob/{salary}")
    public void deletejob(@PathVariable Double salary){
        js.deletejob(salary);
    }
}

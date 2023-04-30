package com.geekster.Job.Portal.Repository;

import com.geekster.Job.Portal.model.Job;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IJobRepo extends CrudRepository<Job,Integer> {
    public List<Job> findByTitle(String title);
    public List<Job> findByLocation(String location);
    public List<Job> findByLocationAndSalaryGreaterThan(String location,Double salary);
    @Modifying
    @Query(value = "update job set salary= :salary where id= :id",nativeQuery = true)
    public void updatesalarybyid(Double salary,Integer id);

    @Modifying
    @Query(value = "delete from job where salary< :salary", nativeQuery = true)
    public void deletebysalary(Double salary);
}

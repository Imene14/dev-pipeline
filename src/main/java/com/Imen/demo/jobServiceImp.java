package com.Imen.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class jobServiceImp implements  jobServiceInterf{
    private List<job> jobs = new ArrayList<>();
    private long nextId = 1L;

    @Override
    public List<job> getAllJobs() {
        return jobs;
    }

    @Override
    public void createJob(job j) {
        j.setId(nextId++);
       jobs.add(j);
    }

    @Override
    public job getJobById(long id) {
        for(job j: jobs){
            if(j.getId() == id){
                return j;
            }
        }
        return null;
    }
}

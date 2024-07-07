package com.Imen.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class jobController {
    private jobServiceInterf jobService;

    public jobController(jobServiceInterf jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @PostMapping("/jobs")
    public String addJob(@RequestBody job j){
        jobService.createJob(j);
        return "Job added successfully";
    }

    @GetMapping("/jobs/{id}")
    public job getJob(@PathVariable long id){
        job j = jobService.getJobById(id);
        return j;
    }
}

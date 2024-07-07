package com.Imen.demo;

import java.util.List;

public interface jobServiceInterf {
    List<job> getAllJobs();
    void createJob(job j);

    job getJobById(long id);
}

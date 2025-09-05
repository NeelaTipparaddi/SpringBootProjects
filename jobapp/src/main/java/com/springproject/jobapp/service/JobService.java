package com.springproject.jobapp.service;

import com.springproject.jobapp.model.JobPost;
import com.springproject.jobapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.addJob(jobPost);
    }
    public List<JobPost> getAllJob(){
       return jobRepo.getAllJob();
    }
}

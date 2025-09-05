package com.springprojects.spring_boot_rest;

import com.springprojects.spring_boot_rest.model.JobPost;
import com.springprojects.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@Controller
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobposts")
//    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJob();
    }
}

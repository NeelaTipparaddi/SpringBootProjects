package com.springsecurity.spring_sec_practice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/hi")
    public String greet(HttpServletRequest request){
        return "Heelo World" + request.getSession().getId();
    }
    @GetMapping("about")
        public String about(HttpServletRequest request){
            return "about method" + request.getSession().getId();
        }
}


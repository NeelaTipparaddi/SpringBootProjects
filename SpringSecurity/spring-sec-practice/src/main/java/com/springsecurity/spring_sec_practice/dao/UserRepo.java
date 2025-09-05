package com.springsecurity.spring_sec_practice.dao;

import com.springsecurity.spring_sec_practice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}

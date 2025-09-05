package com.microservicesprojects.quizapp.dao;

import com.microservicesprojects.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}

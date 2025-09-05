package com.microservicesprojects.quizapp.dao;

import com.microservicesprojects.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategoryIgnoreCase(String category);

@Query(value = "SELECT * from question q where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> fingRandomByQuestionsByCategory(String category, int numQ);
}

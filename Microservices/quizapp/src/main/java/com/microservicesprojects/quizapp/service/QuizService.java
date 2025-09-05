package com.microservicesprojects.quizapp.service;

import com.microservicesprojects.quizapp.dao.QuestionDao;
import com.microservicesprojects.quizapp.dao.QuizDao;
import com.microservicesprojects.quizapp.model.Question;
import com.microservicesprojects.quizapp.model.Quiz;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;
//Request: http://localhost:8080/quiz/create?category=Java&numQ=5&title=JQuiz
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.fingRandomByQuestionsByCategory(category, numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }
}

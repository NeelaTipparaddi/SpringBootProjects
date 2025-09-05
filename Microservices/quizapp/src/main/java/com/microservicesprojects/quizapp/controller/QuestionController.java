package com.microservicesprojects.quizapp.controller;

import com.microservicesprojects.quizapp.model.Question;
import com.microservicesprojects.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    private QuestionService service;
    @GetMapping("allquestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
       return service.getAllQuestions();
    }

//    @GetMapping("category/{cat}")
//    public List<Question> getQuestionByCategory(@PathVariable("cat") String category){
      @GetMapping("category/{category}")
      public List<Question> getQuestionsByCategory(@PathVariable String category){
        return service.getQuestionsByCategory(category);
    }
    @PostMapping("addquestions")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return service.addQuestion(question);
    }
//    @PutMapping("addquestions")
//    public String addQuestion(@RequestBody Question question){
//        return service.addQuestion(question);
//    }
//    @DeleteMapping("addquestions")
//    public String addQuestion(@RequestBody Question question){
//        return service.addQuestion(question);
//    }
}

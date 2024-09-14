package com.example.intermindforge.controller;

import com.example.intermindforge.dto.QuizRequest;
import com.example.intermindforge.dto.QuizResponse;
import com.example.intermindforge.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    private final QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createQuiz(@RequestBody QuizRequest quizRequest) {
        quizService.createQuiz(quizRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<QuizResponse> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }
}

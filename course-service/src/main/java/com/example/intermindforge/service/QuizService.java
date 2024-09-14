package com.example.intermindforge.service;

import com.example.intermindforge.dto.QuizRequest;
import com.example.intermindforge.dto.QuizResponse;
import com.example.intermindforge.model.Quiz;
import com.example.intermindforge.model.QuizQuestion;
import com.example.intermindforge.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public void createQuiz(QuizRequest quizRequest) {
        Quiz newQuiz = Quiz.builder()
                .author(quizRequest.getAuthor())
                .questions(quizRequest.getQuestions())
                .build();
        quizRepository.save(newQuiz);
    }

    public List<QuizResponse> getAllQuizzes() {
        return quizRepository.findAll().stream()
                .map(quiz -> QuizResponse.builder()
                        .id(quiz.getId())
                        .author(quiz.getAuthor())
                        .questions(quiz.getQuestions())
                        .build())
                .collect(Collectors.toList());

    }
}

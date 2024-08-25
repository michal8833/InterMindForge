package com.example.intermindforge;

import com.example.intermindforge.dto.QuizRequest;
import com.example.intermindforge.dto.QuizResponse;
import com.example.intermindforge.model.QuizQuestion;
import com.example.intermindforge.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CourseServiceApplication /* implements CommandLineRunner*/ {

//	@Autowired
//	private QuizService quizService;

	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) {
//		quizService.createQuiz(new QuizRequest("Example author", List.of(new QuizQuestion("question 1"), new QuizQuestion("question 2"))));
//		quizService.createQuiz(new QuizRequest("Example second author", List.of()));
//
//		List<QuizResponse> quizzes = quizService.getAllQuizzes();
//		System.out.println(quizzes);
//	}

}

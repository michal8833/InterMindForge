package com.example.intermindforge.dto;

import com.example.intermindforge.model.QuizQuestion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizRequest {
    private String author;
    private List<QuizQuestion> questions;
}

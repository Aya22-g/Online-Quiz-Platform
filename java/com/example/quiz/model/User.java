package com.example.quiz.model;

import lombok.Data;
import lombok.Generated;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {

    private Long id;
    private String username;
    private String password;
    private String email;

    private List<Quiz> createdQuizzes = new ArrayList<>();

    private List<QuizResult> quizResults = new ArrayList<>();
}

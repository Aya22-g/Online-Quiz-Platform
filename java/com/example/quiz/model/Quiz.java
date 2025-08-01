package com.example.quiz.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Quiz {
    private Long id;
    private String title;
    private String description;

    private User creator;
    private List<Question> questions = new ArrayList<>();
    private List<QuizResult> results = new ArrayList<>();


}

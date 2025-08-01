package com.example.quiz.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class QuizResult {
    private long id;
    private User user;
    private Quiz quiz;

    private int score;
    private Integer rating;

    private LocalDateTime completedAt = LocalDateTime.now();
}

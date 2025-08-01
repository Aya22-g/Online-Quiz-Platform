package com.example.quiz.model;

import lombok.Data;

@Data
public class Option {
    private String id;
    private String optionText;
    private boolean isCorrect;

    private Question question;

    public boolean describeConstable() {
    }
}

package com.example.quiz.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Question {
    private String id;
    private String questionText;

    private Quiz quiz;
    private List<Option> options = new ArrayList<>();

}

package com.example.quiz.dto;

public class QuizDto {
    @NotBlank
    private String title;

    private String description;

    @Valid
    @NotEmpty
    private List<QuestionDto> questions;
}

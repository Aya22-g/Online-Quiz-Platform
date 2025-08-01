package com.example.quiz.dto;

import lombok.Data;

@Data
public class OptionDto {
    @NotBlank
    private String optionText;

    private boolean isCorrect;
}

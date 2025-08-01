package com.example.quiz.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {
    @NotBlank
    private String questionText;

    @Valid
    @Size(min = 2, message = "Каждый вопрос должен иметь минимум 2 варианта ответа")
    private List<OptionDto> options;
}

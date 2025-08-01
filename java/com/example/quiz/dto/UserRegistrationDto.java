package com.example.quiz.dto;

import lombok.Data;

@Data
public class UserRegistrationDto {
    @NotBlank
    @Size(min = 3, max = 20)
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Имя пользователя может содержать только буквы, цифры и подчеркивания")
    private String username;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
}


package com.example.quiz.controller;

import com.example.quiz.dto.QuizDto;
import com.example.quiz.dto.UserRegistrationDto;
import com.example.quiz.model.Quiz;
import com.example.quiz.model.User;
import com.example.quiz.repository.Page;
import com.example.quiz.repository.UserRepository;
import com.example.quiz.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;
    private final UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserRegistrationDto registrationDto) {
      if (userRepository.existsByUsername(registrationDto.getUsername())) {
    throw new BadRequestException("Имя пользователя уже занято");}
    }
    if (userRepository.existsByUsername(registrationDto.getUsername())) {
        throw new BadRequestException("Имя пользователя уже занято");
    }
        if (userRepository.existsByEmail(registrationDto.getEmail())) {
        throw new BadRequestException("Email уже используется");
    }

    User user = new User();
        user.setUsername(registrationDto.getUsername());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());

    User savedUser = userRepository.save(user);
        return ResponseEntity.(savedUser);
}

@GetMapping("/quizzes")
public ResponseEntity<List<Quiz>> getAllQuizzes() {
    QuizService quizService = null;
    return ResponseEntity.ok(quizService.getAllQuizzes());
}

@GetMapping("/quizzes/{quizId}")
public ResponseEntity<Quiz> getQuiz(@PathVariable Long quizId) {
    QuizService quizService;
    return ResponseEntity.ok(quizService.getQuizById(quizId));
}


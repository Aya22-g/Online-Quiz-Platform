package com.example.quiz.service;

import com.example.quiz.exception.ResourceNotFoundException;
import com.example.quiz.exception.UsernameNotFoundException;
import com.example.quiz.model.*;
import com.example.quiz.repository.QuizRepository;
import com.example.quiz.repository.QuizResultRepository;
import com.example.quiz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;
    private final UserRepository userRepository;
    private final QuizResultRepository quizResultRepository;

    public Quiz createQuiz(Quiz quiz, String creatorUsername) {
        User creator = userRepository.findByUsername(creatorUsername)
                .orElseThrow(()-> new UsernameNotFoundException("Такой пользователь не найден"));
        quiz.setCreator(creator);
        return quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Long quizId) {
        Object id;
        return quizRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Викторина не найдена"));
    }

    public QuizResult submitQuizAnswers(Long quizId, Map<Long, Long> answerMap,
                                        String username) {
        return null;
    }

    public Map<String, Object> getUserStatistics(Long userId) {
    }

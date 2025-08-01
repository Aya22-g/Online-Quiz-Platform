package com.example.quiz.repository;

import com.example.quiz.model.Quiz;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByTitleContainingIgnoreCase(String title);

    Quiz save(Quiz quiz);

    List<Quiz> findAll();

    Quiz findById();

}

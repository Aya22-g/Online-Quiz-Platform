package com.example.quiz.repository;

import com.example.quiz.model.QuizResult;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {
    List<QuizResult> findByQuizId(Long quizId);
    List<QuizResult> findByUserid(Long userid);
    Optional<QuizResult> findByUserIdAndQuizId(Long userId, Long quizId);
    boolean existsByUserIdAndQuizId(Long userId, Long quizId);

    Double  findAverageScoreByUserId(Long userId);
    Long countByUserId(Long userId);
    Page<Object[]> findUserLeaderboard(Pageable pageable);
}

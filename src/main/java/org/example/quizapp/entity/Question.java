package org.example.quizapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String questionTitle;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String option1;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String option2;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String option3;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String option4;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String rightAnswer;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String difficultyLevel;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String category;
}

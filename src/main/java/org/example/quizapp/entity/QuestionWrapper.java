package org.example.quizapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class QuestionWrapper {

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

    public QuestionWrapper(int id, String questionTitle, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}

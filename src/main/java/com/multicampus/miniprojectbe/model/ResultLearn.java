package com.multicampus.miniprojectbe.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="result_learn")
public class ResultLearn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Double mark;
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name="subject_id")
    private Subject subject;

}


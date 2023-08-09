package com.multicampus.miniprojectbe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="classA")
@AllArgsConstructor
@NoArgsConstructor
public class ClassA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String className;

    @Column
    private String teacher;

}
package com.multicampus.miniprojectbe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@Table(name="Student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String gender;
    @Column
    private String birthDay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="class_id")
    ClassA classA;

}

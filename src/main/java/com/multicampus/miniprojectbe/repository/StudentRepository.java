package com.multicampus.miniprojectbe.repository;

import com.multicampus.miniprojectbe.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);
    public void deleteByName(String name);
}

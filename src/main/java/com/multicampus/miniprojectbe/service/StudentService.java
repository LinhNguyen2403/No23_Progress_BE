package com.multicampus.miniprojectbe.service;

import com.multicampus.miniprojectbe.model.Student;
import com.multicampus.miniprojectbe.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> searchStudentByName(String name){
        return studentRepository.findByName(name);
    }
    public Optional<Student> searchStudentById(int id){
        return studentRepository.findById(id);
    }
    public void deleteStudentByID(int id){
        studentRepository.deleteById(id);
    }
    public void deleteStudentByName(String name){
        studentRepository.deleteByName(name);
    }

    public void updateStudent( int id, Student student){
        Student student1 = this.searchStudentById(id).orElseThrow();
        student1.setName(student.getName());
        student1.setGender(student.getGender());
    }
}

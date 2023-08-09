package com.multicampus.miniprojectbe.controller;

import com.multicampus.miniprojectbe.model.Student;
import com.multicampus.miniprojectbe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping
    public Student insertStudent (@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/getById/{id}")
//    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Optional<Student> getStudentByid(@PathVariable int id){
        return studentService.searchStudentById(id);
    }

    @GetMapping("/getByName")
//    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Student> getStudentByid(@RequestParam String name){
        return studentService.searchStudentByName(name);
    }
    @PutMapping("/{id}/update")
//    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")

    public String insertStudent(@PathVariable int id,@RequestBody Student student){
        studentService.updateStudent(id, student);
        return "Update Successfully!";
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudentByID(id);
        return "Delete Successfully";
    }
    @DeleteMapping
    public String deleteStudent(@RequestParam String name){
        studentService.deleteStudentByName(name);
        return "Delete Successfully";
    }

}

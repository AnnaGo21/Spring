package com.example.demo.controller;

import com.example.demo.service.StudentService;
import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get")
    public String getStudents(){
        studentService.getStudents();
        return "All students";
    }

    @GetMapping("/get")
    public String getStudentById(@RequestParam int id){
        studentService.getStudent(id);
        return "Student on id " + id + " was returned";
    }

    @GetMapping("/fill")
    public String fill(){
        StudentService.addData();
        return "Filled";
    }
}

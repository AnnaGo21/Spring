package com.example.demo.service;

import com.example.demo.repository.StudentRepository;
import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private static StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public static void addData(){
        studentRepository.fill();
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student getStudent(int id){
        return studentRepository.getStudent(id);
    }

}

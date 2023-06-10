package com.example.demo.repository;

import com.example.demo.student.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepository {
    private Map<Long, Student> list = new HashMap<>();

    public List<Student> findAll(){
        return new ArrayList<>(list.values());
    }
    public void fill(){
        Student s1 = new Student(1, "Ana", "akuba19@gmail.com",
                LocalDate.of(2001, Month.DECEMBER, 16), LocalDate.now().getYear() - 2001);
        Student s2 = new Student(2, "Lui", "lkuba19@gmail.com",
                LocalDate.of(2008, Month.JUNE, 4), LocalDate.now().getYear() - 2008);
        list.put(1L, s1);
        list.put(2L, s2);
    }

    public Student getStudent(int id) {
        return list.get(id);
    }
}

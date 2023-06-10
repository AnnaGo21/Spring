package com.example.demo.config;

import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public StudentService studentService(StudentRepository studentRepository){
        return new StudentService(studentRepository);
    }
    @Bean
    public StudentRepository userRepository(){
        return new StudentRepository();
    }
}

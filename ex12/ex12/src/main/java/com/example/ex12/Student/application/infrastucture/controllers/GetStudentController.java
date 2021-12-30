package com.example.ex12.Student.application.infrastucture.controllers;

import com.example.ex12.Student.application.domain.Student;
import com.example.ex12.Student.application.ports.GETStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class GetStudentController {
    @Autowired
    GETStudentPort getStudentPort;

    @GetMapping("/student")
    public List<Student> getAllStudents() throws Exception{
        return getStudentPort.getAllStudent();
    }

}

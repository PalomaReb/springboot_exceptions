package com.example.ex12.Student.application.ports.useCase;

import com.example.ex12.Student.application.domain.Student;
import com.example.ex12.Student.application.domain.StudentJPA;
import com.example.ex12.Student.application.ports.GETStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GETusecase implements GETStudentPort {

    @Autowired
    StudentJPA studentJPA;


    @Override
    public List<Student> getAllStudent() {
        return studentJPA.findAll();
    }

    //@Override
    public List<Student> getName(String branch) {
        return studentJPA.findByName(branch);
    }

    @Override
    public Student getStudentById(String id) throws Exception {
        Student student = (Student) studentJPA.findById(id).orElseThrow();
        return studentJPA.findById(id).get();
    }
}

package com.example.ex12.Student.application.ports;

import com.example.ex12.Student.application.domain.Student;

import java.util.List;

public interface GETStudentPort {

    public List<Student> getAllStudent()throws Exception;
    public List<Student> getName(String branch) throws Exception;

    public Student getStudentById (String id) throws Exception;


}

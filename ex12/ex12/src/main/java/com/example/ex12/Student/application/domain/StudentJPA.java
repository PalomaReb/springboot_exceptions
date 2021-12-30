package com.example.ex12.Student.application.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentJPA extends JpaRepository <Student, String>{
    List<Student> findByName(String branch);

}

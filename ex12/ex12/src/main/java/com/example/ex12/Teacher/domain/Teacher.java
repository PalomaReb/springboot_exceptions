package com.example.ex12.Teacher.domain;

import com.example.ex12.Person.application.domain.Person;
import com.example.ex12.Student.domain.Student;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Teacher {

    @Id
    @Column(name="id_profesor")
    private String id_profesor;

    @Column(name="asignatura")
    private String branch;

    @OneToOne ( cascade = CascadeType.ALL)
    private Person person_profesor;





}

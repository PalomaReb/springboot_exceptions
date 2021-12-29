package com.example.ex12.Teacher.domain;

import com.example.ex12.Person.application.domain.Person;
import com.example.ex12.Student.domain.Student;
import lombok.Data;

import javax.persistence.*;

@Table(name="Profesor")
@Entity
@Data
public class Teacher {

    @Id
    @Column(name="id_profesor")
    private String id_profesor;

    @Column(name="asignatura")
    private String branch;

    @OneToOne ( cascade = CascadeType.ALL)
    @JoinColumn(name="id_persona")
    private Person person_profesor;





}

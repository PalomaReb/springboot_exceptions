/*package com.example.ex12.Teacher.domain;

import com.example.ex12.Person.application.domain.Person;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name="Profesor")
@Entity
@Data
@Getter
@Setter
public class Teacher {

    @Id
    @Column(name="id_profesor")
    private String id_profesor;

    @Column(name="asignatura")
    private String branch;

    @OneToOne ( cascade = CascadeType.ALL)
    @JoinColumn(name="id_persona")
    private Person person_profesor;

    /*
    @ManyToOne ( cascade = CascadeType.All)
    @JoinColumn(name="id_student")
    private Student student_profesor;
     */



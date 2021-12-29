package com.example.ex12.Student.domain;

import com.example.ex12.Person.application.domain.Person;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    @Column(name="id_student")
    private String id_student;

    @Column (name="num_hours_week")
    private int num_hours_week;
    @Column ( name="branch")
    private String branch;


    @OneToOne ( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Person person_student;




}

package com.example.ex12.Student.application.domain;

//import com.example.ex12.Course.domain.Course;
import com.example.ex12.Person.application.domain.Person;
//import com.example.ex12.Teacher.domain.Teacher;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name="Estudiante")
@Entity
@Data
@Getter
@Setter
public class Student {

    @Id
    @Column(name="id_student")
    private String id_student;

    @Column (name="num_hours_week")
    private int num_hours_week;
    @Column ( name="branch")
    private String branch;
    @Column (name="comments")
    private String comments;
/*
    @OneToOne ( cascade = CascadeType.ALL)
    @JoinColumn (name="id_person")
    private Person person_student;

    @ManyToOne (cascade = CascadeType.ALL)
   @JoinColumn(name = "id_asignatura")
    private List<Course> course_student = new ArrayList<>();


    /*@OneToMany ( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name ="id_profesor")
    private Teacher student_teacher;*/


}

/*package com.example.ex12.Course.domain;

import com.example.ex12.Student.application.domain.Student;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name="Asignatura")
@Entity
@Data
public class Course {

    @Id
    @Column(name="id_asignatura")
    private String id_asignatura;

    @Column(name="course")
    private String asignatura;

    @NotNull
    private Date initial_Date;

    @Column(name="term_date")
    private Date term_date;

    @OneToMany (fetch = FetchType.LAZY)
    @JoinColumn(name="id_student")
    private Student student_course;







}
*/
package com.example.ex12.Course.domain;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

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

    private Date term_date;




}

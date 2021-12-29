package com.example.ex12.Person.application.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity

public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String usuario;
    private String password;
    @Column(name = "name")
    private String name;
    private String lastName;
    private String comp_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String image_url;
    private Date term_Date;


}

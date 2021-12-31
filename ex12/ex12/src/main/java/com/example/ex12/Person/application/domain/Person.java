package com.example.ex12.Person.application.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Getter
@Setter

public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String usuario;
    private String password;
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

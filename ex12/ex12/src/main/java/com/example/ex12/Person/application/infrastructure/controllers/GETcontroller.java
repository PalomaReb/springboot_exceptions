package com.example.ex12.Person.application.infrastructure.controllers;


import com.example.ex12.Person.application.Ports.ports.GETport;
import com.example.ex12.Person.application.infrastructure.DTO.PersonOUTPUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GETcontroller {
    @Autowired
    GETport geTport;

    @GetMapping("/id/{id}")
    public PersonOUTPUT getPersonById (@PathVariable int id) throws Exception{
        return geTport.getPersonById(id);
    }

    @GetMapping("/name/{name}")
    public List<PersonOUTPUT> personName (@PathVariable String name) throws Exception{
        return geTport.findByName(name);
    }

    @GetMapping("/allPerson")
    public List <PersonOUTPUT> getAll() throws Exception {
        return geTport.getAll();
    }

}

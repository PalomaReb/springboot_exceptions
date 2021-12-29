package com.example.ex12.Person.application.infrastructure.controllers;

import com.example.ex12.Person.application.Ports.ports.POSTport;
import com.example.ex12.Person.application.infrastructure.DTO.PersonINPUT;
import com.example.ex12.Person.application.infrastructure.DTO.PersonOUTPUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSTcontroller {
    @Autowired
    POSTport posTport;

    @PostMapping("addPerson")
    public PersonOUTPUT addNewPerson (@RequestBody PersonINPUT personINPUT)throws Exception{
        return posTport.addPerson(personINPUT);
    }
}

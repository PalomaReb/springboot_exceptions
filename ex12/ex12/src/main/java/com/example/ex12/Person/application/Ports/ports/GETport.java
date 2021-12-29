package com.example.ex12.Person.application.Ports.ports;

import com.example.ex12.Person.application.infrastructure.DTO.PersonOUTPUT;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GETport {

    PersonOUTPUT getPersonById(int id) throws Exception;
    List <PersonOUTPUT> findbyName(String name) throws Exception;
    List<PersonOUTPUT> getAll() throws Exception;

}

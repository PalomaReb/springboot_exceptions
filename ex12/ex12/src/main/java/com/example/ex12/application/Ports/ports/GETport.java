package com.example.ex12.application.Ports.ports;

import com.example.ex12.application.domain.PersonJPA;
import com.example.ex12.application.infrastructure.DTO.PersonOUTPUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GETport {

    PersonOUTPUT getPersonById(int id) throws Exception;
    List <PersonOUTPUT> findbyName(String name) throws Exception;
    List<PersonOUTPUT> getAll() throws Exception;

}

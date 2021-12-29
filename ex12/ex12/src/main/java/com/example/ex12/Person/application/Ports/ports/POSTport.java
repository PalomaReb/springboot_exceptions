package com.example.ex12.Person.application.Ports.ports;

import com.example.ex12.Person.application.infrastructure.DTO.PersonINPUT;
import com.example.ex12.Person.application.infrastructure.DTO.PersonOUTPUT;

public interface POSTport {
    PersonOUTPUT addPerson (PersonINPUT person) throws Exception;
    
}

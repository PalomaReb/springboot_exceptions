package com.example.ex12.application.Ports.ports;

import com.example.ex12.application.infrastructure.DTO.PersonINPUT;
import com.example.ex12.application.infrastructure.DTO.PersonOUTPUT;

public interface POSTport {
    PersonOUTPUT addPerson (PersonINPUT person) throws Exception;
    
}

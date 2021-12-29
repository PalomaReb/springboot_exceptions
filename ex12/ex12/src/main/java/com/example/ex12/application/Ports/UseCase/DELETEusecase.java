package com.example.ex12.application.Ports.UseCase;

import com.example.ex12.application.Ports.ports.DELETEport;
import com.example.ex12.application.domain.PersonJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DELETEusecase implements DELETEport {

    @Autowired
    PersonJPA personJPA;

    public void deletePerson(int id) throws Exception {
        if(personJPA.findById(id).isEmpty()){throw new Exception("No se encuentra persona");}
        personJPA.delete(personJPA.findById(id).get());
    }
}

package com.example.ex12.Person.application.Ports.UseCase;

import com.example.ex12.Person.application.domain.Person;
import com.example.ex12.Person.application.domain.PersonJPA;
import com.example.ex12.Person.application.Ports.ports.GETport;
import com.example.ex12.Person.application.infrastructure.DTO.PersonOUTPUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GETuseCase implements GETport {

    @Autowired
    PersonJPA personJPA;


    @Override
    public PersonOUTPUT getPersonById(int id) throws Exception {
        Person person = (Person) personJPA.findById(id).orElseThrow();
        PersonOUTPUT personOUTPUT = new PersonOUTPUT();
        return personOUTPUT.changeDTO(person);

    }

    @Override
    public List<PersonOUTPUT> findbyName(String name) throws Exception {
        List <Person> person = personJPA.findByName(name);
        return toListDTOoutput(person);
    }

    List<PersonOUTPUT> toListDTOoutput(List<Person> person){
        List<PersonOUTPUT> personasDTO = new ArrayList();

        PersonOUTPUT personList = new PersonOUTPUT();

        for(Person persons: person){
            personasDTO.add(personList.changeDTO(persons));
        }
        return personasDTO;
    }

    @Override
    public List<PersonOUTPUT> getAll() throws Exception {
        List<Person> personas = personJPA.findAll();

        return toListDTOoutput(personas);

    }
}

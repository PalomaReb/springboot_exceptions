package com.example.ex12.application.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Column;
import java.util.List;

public interface PersonJPA extends JpaRepository <Person, Integer> {
List <Person> findByName(String name);
}

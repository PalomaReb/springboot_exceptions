package com.example.ex12.Person.application.infrastructure;

import com.example.ex12.Person.application.domain.exceptions.NotFoundException;
import com.example.ex12.Person.application.infrastructure.errors.Error;
import com.example.ex12.Person.application.domain.exceptions.UnprocesableExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExcenHandler {
    @Autowired
    Error error;

@ExceptionHandler ({NotFoundException.class})
    public Error notFound(){
    return error.NotFoundException();
}

    @ExceptionHandler ({UnprocesableExceptions.class})
    public Error unprocExcep  (){
        return error.UnprocesableExceptions();
    }
}

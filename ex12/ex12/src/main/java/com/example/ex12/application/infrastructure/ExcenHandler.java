package com.example.ex12.application.infrastructure;

import com.example.ex12.application.domain.exceptions.NotFoundException;
import com.example.ex12.application.domain.exceptions.UnprocesableExceptions;
import com.example.ex12.application.infrastructure.errors.Error;
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

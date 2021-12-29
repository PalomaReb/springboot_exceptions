package com.example.ex12.application.domain.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
 //   @Autowired
    //Error error;

    public NotFoundException ( String message){
        super(message);


    }

}

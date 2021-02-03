package com.joon.demo.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

//@Component
public class AppRunner implements ApplicationRunner {
    @Qualifier("defaultValidator")
    @Autowired
    Validator validator;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Event event=new Event();
        Errors errors=new BeanPropertyBindingResult(event, "event");
        EventValidator eventValidator=new EventValidator();
        eventValidator.validate(event,errors);
        validator.validate(event, errors);
        System.out.println(errors.hasErrors());
        errors.getAllErrors().forEach(e->{
            System.out.println(e.getCode());
            System.out.println(e.toString());
            System.out.println(e.getObjectName());
            System.out.println(e.getDefaultMessage());
        });

    }
}

package com.joon.demo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

//@Component
public class EventConverter implements Converter<String, Event> {
    @Override
    public Event convert(String value) {
        Long id= Long.valueOf(value);
        return new Event(id,"hello");
    }

}

package com.joon.demo.converter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
@Component
public class EventFormatter implements Formatter<Event> {
    @Override
    public Event parse(String text, Locale locale) throws ParseException {
        return new Event(Long.parseLong(text), "hello");
    }

    @Override
    public String print(Event object, Locale locale) {
        return object.getId().toString();
    }
}

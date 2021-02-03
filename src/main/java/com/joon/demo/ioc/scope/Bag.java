package com.joon.demo.ioc.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bag {
    @Autowired
     Book book;
    public Book getBook() {
        return book;
    }
}

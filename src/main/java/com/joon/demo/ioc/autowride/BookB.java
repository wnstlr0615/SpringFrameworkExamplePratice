package com.joon.demo.ioc.autowride;

import org.springframework.stereotype.Service;

@Service
public class BookB implements BaseBookService{
    @Override
    public void hello() {
        System.out.println("Book B");
    }
}

package com.joon.demo.ioc.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext context;
    @Autowired
    Bag bag;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("프로토 타입");
        System.out.println(context.getBean(Book.class));
        System.out.println(context.getBean(Book.class));
        System.out.println(context.getBean(Book.class));
        System.out.println("싱글톤");
        System.out.println(context.getBean(Bag.class));
        System.out.println(context.getBean(Bag.class));
        System.out.println(context.getBean(Bag.class));
        System.out.println("싱글톤 에서 프로토 타입호출");
        System.out.println((context.getBean(Bag.class)).getBook());
        System.out.println((context.getBean(Bag.class)).getBook());
        System.out.println((context.getBean(Bag.class)).getBook());
    }
}

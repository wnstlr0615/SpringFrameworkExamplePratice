package com.joon.demo.ioc.messagesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;

import java.util.Locale;

//@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext context;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String message = context.getMessage("say", new String[]{"joon"}, Locale.KOREA);
        System.out.println(message);
    }
}

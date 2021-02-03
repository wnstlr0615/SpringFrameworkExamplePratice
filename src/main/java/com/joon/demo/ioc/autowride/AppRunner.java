package com.joon.demo.ioc.autowride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class AppRunner implements ApplicationRunner {
    @Qualifier("bookA")
    @Autowired
    BaseBookService bookService;   //동일 타입이 여러개 인경우 @Primary 사용 또는 @Qualifier 사용
    @Override
    public void run(ApplicationArguments args) throws Exception {
        bookService.hello();
    }
}

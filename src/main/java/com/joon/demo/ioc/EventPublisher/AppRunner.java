package com.joon.demo.ioc.EventPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;

//@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext context;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        context.publishEvent(new MyEvent("메시지 전송", this));
    }
}

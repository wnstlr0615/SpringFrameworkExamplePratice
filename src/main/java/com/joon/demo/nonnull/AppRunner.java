package com.joon.demo.nonnull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    EventService event;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String event = this.event.createEvent(null);
    }
}

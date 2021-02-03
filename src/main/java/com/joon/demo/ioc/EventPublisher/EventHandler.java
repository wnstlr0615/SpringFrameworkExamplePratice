package com.joon.demo.ioc.EventPublisher;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {
    @EventListener
    @Async
    public void getEvent(MyEvent myEvent){
        System.out.println(myEvent.getMessage());
    }
}

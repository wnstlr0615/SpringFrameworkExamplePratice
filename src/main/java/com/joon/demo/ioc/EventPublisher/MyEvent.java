package com.joon.demo.ioc.EventPublisher;

public class MyEvent {
    private String message;
    private Object object;

    public MyEvent(String message, Object object) {
        this.message = message;
        this.object = object;
    }

    public String getMessage() {
        return message;
    }
}

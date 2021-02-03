package com.joon.demo.aop;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @CheckTime
    public void eventStart() throws InterruptedException {
        System.out.println("이벤트 시작");
        Thread.sleep(1000);
        System.out.println("이벤트 끝");
    }
}

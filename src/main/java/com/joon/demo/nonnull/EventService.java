package com.joon.demo.nonnull;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class EventService {

    @NonNull
    public String createEvent( @NonNull String msg){
        return null;
    }
}

package com.joon.demo.ioc.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS) //싱글톤에서 프록시 타입 객체 호출 시 다른 값을 적용하도록 변경
public class Book {
}

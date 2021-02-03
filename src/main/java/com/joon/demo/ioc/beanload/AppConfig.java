package com.joon.demo.ioc.beanload;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.joon.demo.ioc"})
public class AppConfig {
}

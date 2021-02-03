package com.joon.demo.ioc.beanload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.XmlWebApplicationContext;

//@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext context; //BeanFactory 확장 버전
    @Override
    public void run(ApplicationArguments args) throws Exception {
         ApplicationContext con= new AnnotationConfigApplicationContext(AppConfig.class); // 어노테이션 모드
        //ApplicationContext con= new XmlWebApplicationContext();  //xml 로드

        //GetBeanService bean = context.getBean(GetBeanService.class);
        System.out.println(con.getBean(GetBeanService.class));
    }
}

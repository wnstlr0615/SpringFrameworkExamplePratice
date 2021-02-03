package com.joon.demo.ioc.environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@PropertySource("classpath:app.properties")
public class AppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext context;

    @Autowired
    BookRepository bookRepository; //프로파일이 test로 설정되어 있기때문에 test로 설정할 경우에만 호출
    @Value("${greeting}")
    String greeting;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment=context.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
        System.out.println(environment.getProperty("user.name")); //JVM에 등록해서 사용
        System.out.println(environment.getProperty("my.name")); //application.properties 에 등록해서 사용
        System.out.println(environment.getProperty("greeting")); //application.properties 에 등록해서 사용
        System.out.println(greeting);

        System.out.println(context.getBean(BookRepository.class));


    }
}

package com.joon.demo.ioc.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
//@Profile("!prod")  아무것도 설정하지 않을경우에만 호출
public class BookRepository {
}

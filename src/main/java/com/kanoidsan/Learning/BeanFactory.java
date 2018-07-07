package com.kanoidsan.Learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class BeanFactory {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BeanFactory.class, args);
    }
}
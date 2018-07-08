package com.kanoidsan.Learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMVCApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringMVCApplication.class, args);
    }
}
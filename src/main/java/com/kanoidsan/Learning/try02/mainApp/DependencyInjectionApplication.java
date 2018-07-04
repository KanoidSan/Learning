package com.kanoidsan.Learning.try02.mainApp;

import com.kanoidsan.Learning.try02.scaningPlace.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kanoidsan.Learning.try02.scaningPlace")
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

        greetingController.sayHello();
    }
}

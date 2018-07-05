package com.kanoidsan.Learning.try03.mainApp;

import com.kanoidsan.Learning.try03.scaningPlace.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kanoidsan.Learning.try03.scaningPlace")
public class ConfigurationClassesAplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ConfigurationClassesAplication.class, args);

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

        greetingController.sayHello();
    }
}

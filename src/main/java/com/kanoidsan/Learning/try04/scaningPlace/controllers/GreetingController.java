package com.kanoidsan.Learning.try04.scaningPlace.controllers;

import com.kanoidsan.Learning.try04.scaningPlace.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingController {
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServicePolish;
    private HelloWorldService helloWorldServiceFrench;

    //to every implementation you need to add qualifier, if you don't do that,
    // Spring will not recognize which instance should he pass
    @Autowired
    @Qualifier("helloWorldServiceEnglish")
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("helloWorldServicePolish")
    public void setHelloWorldServicePolish(HelloWorldService helloWorldService) {
        this.helloWorldServicePolish = helloWorldService;
    }

    @Autowired
    @Qualifier("french")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldService) {
        this.helloWorldServiceFrench = helloWorldService;
    }

    public String sayHello(){
        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);
        System.out.println(helloWorldServicePolish.getGreeting());
        System.out.println(helloWorldServiceFrench.getGreeting());

        return greeting;
    }
}

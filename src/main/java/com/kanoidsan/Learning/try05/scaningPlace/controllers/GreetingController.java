package com.kanoidsan.Learning.try05.scaningPlace.controllers;

import com.kanoidsan.Learning.try05.scaningPlace.services.HelloWorldService;

public class GreetingController {
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServicePolish;
    private HelloWorldService helloWorldServiceFrench;

    //to every implementation you need to add qualifier, if you don't do that,
    // Spring will not recognize which instance should he pass

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void setHelloWorldServicePolish(HelloWorldService helloWorldService) {
        this.helloWorldServicePolish = helloWorldService;
    }

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

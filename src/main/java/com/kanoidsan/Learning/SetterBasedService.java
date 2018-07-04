package com.kanoidsan.Learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedService {

    private HelloWorldService helloWorldService;

    @Autowired
    public SetterBasedService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(){
        helloWorldService.saySomething();
    }
}

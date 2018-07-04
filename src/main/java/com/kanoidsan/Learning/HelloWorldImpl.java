package com.kanoidsan.Learning;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService{
    public void saySomething(){
        System.out.println("I'm saying something!");
    }
}

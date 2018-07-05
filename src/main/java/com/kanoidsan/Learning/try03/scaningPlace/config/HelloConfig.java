package com.kanoidsan.Learning.try03.scaningPlace.config;

import com.kanoidsan.Learning.try03.scaningPlace.services.HelloWorldService;
import com.kanoidsan.Learning.try03.scaningPlace.services.HelloWorldServiceEnglishImpl;
import com.kanoidsan.Learning.try03.scaningPlace.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldServiceSpanishImpl();
    }
}

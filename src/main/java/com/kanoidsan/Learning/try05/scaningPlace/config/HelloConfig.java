package com.kanoidsan.Learning.try05.scaningPlace.config;

import com.kanoidsan.Learning.try05.scaningPlace.services.HelloWorldFactory;
import com.kanoidsan.Learning.try05.scaningPlace.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
        return factory.createHelloWorld("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory){
        return factory.createHelloWorld("es");
    }

    @Bean
    public HelloWorldService helloWorldServicePolish(HelloWorldFactory factory){
        return factory.createHelloWorld("pl");
    }

    @Bean
    public HelloWorldService helloWorldServiceDeutsch(HelloWorldFactory factory){
        return factory.createHelloWorld("de");
    }

    @Bean(name = "french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory){
        return factory.createHelloWorld("fr");
    }
}

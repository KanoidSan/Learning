package com.kanoidsan.Learning.try05.scaningPlace.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorld(String lang) {
        HelloWorldService service = null;

        switch (lang) {
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "pl":
                service = new HelloWorldServicePolishImpl();
                break;
            case "de":
                service = new HelloWorldServiceDeutschImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            default:
                service = new HelloWorldServiceEnglishImpl();
        }

        return service;
    }

}
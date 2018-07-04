package com.kanoidsan.Learning.try01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LearningApplication.class, args);
		InjectedByConstructorService constructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
		constructorService.getMessage();
	}
}

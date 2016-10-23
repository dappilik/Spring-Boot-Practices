package com.krishna.spring.tutorial.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "hello",
        "com.krishna.spring.tutorial.mail",
        "com.krishna.spring.tutorial.controllers"})


@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//@ComponentScan(basePackages={"hello"});
	}

}

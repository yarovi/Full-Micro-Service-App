package com.yasmani.net.utils;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class EnvChecker {

	private final Environment environment;

    public EnvChecker(Environment environment) {
        this.environment = environment;
    }

    @PostConstruct
    public void printMongoProperties() {
        System.out.println("spring.data.mongodb.database = " + environment.getProperty("spring.data.mongodb.database"));
        System.out.println("spring.data.mongodb.username = " + environment.getProperty("spring.data.mongodb.username"));
        System.out.println("spring.data.mongodb.password = " + environment.getProperty("spring.data.mongodb.password"));
    }
    
}

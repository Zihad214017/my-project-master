package com.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class App {

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void init() {
        System.out.println("App initialized!");
    }

    public String getStatus() {
        return "OK";
    }
}

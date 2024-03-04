package com.example.interceptor;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IncerceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncerceptorApplication.class, args);
    }

    @PostConstruct
    public void someMethod() {
        System.out.println("someMethod running because of @PostConstruct");
    }

}

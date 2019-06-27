package com.demo.testguava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.testguava.*")
public class TestguavaApplication {

    public static void main(String[] args) {
        System.out.println("aaaa");
        SpringApplication.run(TestguavaApplication.class, args);
    }

}

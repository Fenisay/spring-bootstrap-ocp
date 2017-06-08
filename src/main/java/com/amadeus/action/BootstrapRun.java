package com.amadeus.action;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
 

@SpringBootApplication
public class BootstrapRun {
 
    public static void main(String[] args) {
        SpringApplication.run(BootstrapRun.class, args);
    }
}
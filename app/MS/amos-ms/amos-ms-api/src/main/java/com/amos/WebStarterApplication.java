package com.amos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(value = "com.amos.controller")
@SpringBootApplication
public class WebStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStarterApplication.class, args);
    }

}

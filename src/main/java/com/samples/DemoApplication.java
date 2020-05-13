package com.samples;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(DemoApplication.class);

    private String name = "demoApplicationName";

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

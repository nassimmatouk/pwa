package com.example.testlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class TestlabApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestlabApplication.class, args);
	}

}

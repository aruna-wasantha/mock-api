package com.task.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MockAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockAPIApplication.class, args);
	}

}

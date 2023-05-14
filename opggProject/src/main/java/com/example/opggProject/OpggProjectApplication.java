package com.example.opggProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class OpggProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpggProjectApplication.class, args);
	}

}

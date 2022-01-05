package com.example.udemy.web.proj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.udemy.web.proj1")

public class Proj1Application {

	public static void main(String[] args) {
		SpringApplication.run(Proj1Application.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 

public class SpringBootDockerfile1Application {
	
	@GetMapping ("/hello")
	public String getMessage() {
		return "Welcome Back!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerfile1Application.class, args);
	}

}

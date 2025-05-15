package com.myapp.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
		scanBasePackages = {"com.myapp.util", "com.myapp.demo"}
)

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner CommandLineRunner(String[] args){
		return runner -> {
			System.out.println("Hello World");
		};
	}

}

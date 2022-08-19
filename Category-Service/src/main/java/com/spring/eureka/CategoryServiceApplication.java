package com.spring.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CategoryServiceApplication {
//	private static ConfigurableApplicationContext context;
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CategoryServiceApplication.class, args);
	}

}

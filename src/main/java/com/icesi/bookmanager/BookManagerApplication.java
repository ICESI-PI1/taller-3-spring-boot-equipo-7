package com.icesi.bookmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages = "com.icesi.bookmanager")
public class BookManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookManagerApplication.class, args);
	}
}

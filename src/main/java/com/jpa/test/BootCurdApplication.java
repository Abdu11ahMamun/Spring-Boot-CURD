package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jpa.test.*")
public class BootCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCurdApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8Application {

	public static void main(String[] args) {
		
		
		SpringApplication.run(Java8Application.class, args);
		//MyInterface MyInterfac = new lembda();
		//MyInterfac.syhello();
		MyInterface my = () -> System.out.println("From Main Method using lembda");
		my.syhello();
		
		
		
	}

}

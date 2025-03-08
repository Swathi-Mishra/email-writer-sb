package com.email.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailWriterSbApplication {

	public static void main(String[] args) {
		System.out.println("Listening on port: " + System.getenv("PORT"));
		SpringApplication.run(EmailWriterSbApplication.class, args);
	}

}

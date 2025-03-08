package com.email.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailWriterSbApplication {

	public static void main(String[] args) {
		String port = System.getenv("PORT") != null ? System.getenv("PORT") : "8080";
        System.getProperties().put("server.port", port); // Programmatically setting port
		SpringApplication.run(EmailWriterSbApplication.class, args);
	}

}

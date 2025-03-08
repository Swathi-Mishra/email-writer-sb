package com.email.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailWriterSbApplication {

	public static void main(String[] args) {
		String port = System.getenv("PORT");
    System.out.println("Detected PORT value: " + port);
		SpringApplication.run(EmailWriterSbApplication.class, args);
	}

}

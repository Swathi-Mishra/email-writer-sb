package com.email.writer;

//import java.util.logging.Logger;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmailWriterSbApplication {
	private static final Logger logger = LoggerFactory.getLogger(EmailWriterSbApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmailWriterSbApplication.class, args);

		SpringApplication app = new SpringApplication(EmailWriterSbApplication.class);
        ConfigurableApplicationContext context = app.run(args);

        // Log the active port
        int port = context.getEnvironment().getProperty("local.server.port", Integer.class, 8080);
        logger.info("Application started successfully on port: {}", port);
	}

}

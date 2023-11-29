package com.javatechie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SwiggyServiceRegistryApplication {

	private static final Logger logger = LoggerFactory.getLogger(SwiggyServiceRegistryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SwiggyServiceRegistryApplication.class, args);
		logger.info("SwiggyServiceRegistryApplication initialized!!!");
	}

}

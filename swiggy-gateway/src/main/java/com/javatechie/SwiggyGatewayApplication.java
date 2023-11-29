package com.javatechie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SwiggyGatewayApplication {

	private static final Logger logger = LoggerFactory.getLogger(SwiggyGatewayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SwiggyGatewayApplication.class, args);
		logger.info("SwiggyGatewayApplication initialized!!!");
	}

}

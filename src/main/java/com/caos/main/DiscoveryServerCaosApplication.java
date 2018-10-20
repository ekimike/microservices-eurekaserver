package com.caos.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerCaosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerCaosApplication.class, args);
	}
}

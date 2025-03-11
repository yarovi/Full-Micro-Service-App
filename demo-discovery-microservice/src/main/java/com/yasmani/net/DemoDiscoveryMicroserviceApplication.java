package com.yasmani.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoDiscoveryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDiscoveryMicroserviceApplication.class, args);
	}

}

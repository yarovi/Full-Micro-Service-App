package com.yasmani.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoConfigMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigMicroserviceApplication.class, args);
	}

}

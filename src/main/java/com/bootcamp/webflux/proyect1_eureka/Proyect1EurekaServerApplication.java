package com.bootcamp.webflux.proyect1_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Proyect1EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyect1EurekaServerApplication.class, args);
	}

}

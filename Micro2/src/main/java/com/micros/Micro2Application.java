package com.micros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Micro2Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro2Application.class, args);
	}

}

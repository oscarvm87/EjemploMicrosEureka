package com.micros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Micro1Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro1Application.class, args);
	}

}

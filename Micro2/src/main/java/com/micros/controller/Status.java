package com.micros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/status2")
public class Status {

	@GetMapping
	public String status() {
		return "Bienvenido al microservicio 2.1";
	}
}

package com.example.springboot.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(path="/en")
	public String getEnglish() {
		return "Hello";
	}
	
	@RequestMapping(path="/es")
	public String getSpanish() {
		return "Hola";
	}
	
}

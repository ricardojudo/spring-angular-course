package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring.entities.FakeNew;
import com.example.spring.entities.New;

@Configuration
public class AppConfig {
	
	/*
	 * Utilizar atributos initMethod y destroyMethod
	 */
	//>>
	@Bean
	public New fakeNew() {
		return new FakeNew();
	}
	
	

}

package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.spring.entities.FakeNew;
import com.example.spring.entities.New;

@Configuration
@ComponentScan("com.example.spring")
@EnableAspectJAutoProxy
public class AppConfig {
	
	
	@Bean
	public New fakeNew() {
		return new FakeNew();
	}
	
	

}

package com.example.spring;

import java.text.NumberFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

	@Bean
	public NumberFormat numberFormat() {
		return NumberFormat.getCurrencyInstance();
	}
}

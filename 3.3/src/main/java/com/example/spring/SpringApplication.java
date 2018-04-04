package com.example.spring;

import java.text.NumberFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		/*
		 * Obtener NumberFormat de contexto de Spring
		 */
		NumberFormat nf = applicationContext.getBean(NumberFormat.class);
		System.out.println(nf.format(98097876554.94873487438));
		
		
		
		
		/*
		 * 
		 */


	}

}

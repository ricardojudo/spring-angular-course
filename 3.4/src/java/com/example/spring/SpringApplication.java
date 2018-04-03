package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.entities.New;

public class SpringApplication {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		New neww = applicationContext.getBean("fakeNew", New.class);
		System.out.println(neww);
		
		
		/*
		 * Cerrar applicationContext
		 */
		((AnnotationConfigApplicationContext)applicationContext).close();

	}

}

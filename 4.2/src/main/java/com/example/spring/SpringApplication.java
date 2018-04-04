package com.example.spring;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.entities.New;

public class SpringApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);		
		New neww = applicationContext.getBean("fakeNew", New.class);
		neww.publish("Tasas gratis para todos", new Date(), "Se regalan tasas en la zona de interlomas");
		
		
		/*
		 * Cerrar applicationContext
		 */
		((AnnotationConfigApplicationContext)applicationContext).close();

	}

}

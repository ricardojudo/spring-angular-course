package com.example.spring;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.entities.New;

public class SpringApplicationXML {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");		
		New neww = applicationContext.getBean("fakeNew", New.class);
		neww.publish("Tragos gratis para todos", new Date(), "Se regalan tragos en la zona de interlomas");

		
		/*
		 * Cerrar applicationContext
		 */
		((ClassPathXmlApplicationContext)applicationContext).close();

	}

}

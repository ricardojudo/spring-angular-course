package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.entities.New;

public class SpringApplicationXML {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");		
		New neww = applicationContext.getBean("fakeNew", New.class);
		System.out.println(neww);
		
		/*
		 * Cerrar applicationContext
		 */
		((ClassPathXmlApplicationContext)applicationContext).close();

	}

}

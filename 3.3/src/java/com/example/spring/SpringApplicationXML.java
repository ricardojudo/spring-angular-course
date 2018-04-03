package com.example.spring;

import java.text.NumberFormat;
import java.util.TimeZone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationXML {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		 * Obtener NumberFormat del contexto de Spring
		 */
		NumberFormat nf = applicationContext.getBean(NumberFormat.class);
		System.out.println(nf.format(7897968754.94873487438));
		
		/*
		 * Obtener ZonaHoraria local del contexto de Spring
		 */
		TimeZone timeZone = applicationContext.getBean(TimeZone.class);
		System.out.println(timeZone);
		
	}

}

package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.entities.Game;
import com.example.spring.entities.Team;

public class SpringApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		/*
		 * Imprimir game en pantalla 
		 */
		

		/*
		 * Obtener segundo objeto game
		 */
		
		/*
		 * Obtener equipo bulls del contexto y establecerlo en 
		 * game2 como equipo visitante
		 */
		
		/*
		 * Imprimir game en pantalla nuevamente 
		 */
		
		
	}

}

package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.entities.Game;
import com.example.spring.entities.Team;

public class SpringApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Game game = applicationContext.getBean("game", Game.class);
		
		/*
		 * Imprimir game en pantalla 
		 */
		System.out.println("game: " + game.toString());
		

		/*
		 * Obtener segundo objeto game
		 */
		Game game2 = applicationContext.getBean("game", Game.class);
		
		/*
		 * Obtener equipo bulls del contexto y establecerlo en 
		 * game2 como equipo visitante
		 */
		Team bulls = applicationContext.getBean("bulls", Team.class);
		game2.setAwayTeam(bulls);
		System.out.println("game2: " + game2.toString());
		
		/*
		 * Imprimir game en pantalla nuevamente 
		 */
		System.out.println("game: " + game.toString());
		
		
	}

}

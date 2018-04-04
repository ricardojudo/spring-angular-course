package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.entities.Game;

public class SpringApplication {

	public static void main(String[] args) {
		
		/*
		 * Obtener objeto Game del contexto de Spring
		 */
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Utilizando solamente la clase
		//Game game = applicationContext.getBean(Game.class);
		
		//Utilizando el nombre y clase
		Game game = applicationContext.getBean("game", Game.class);
		
		/*
		 * Imprimir resultado del juego en pantalla
		 */
		System.out.println(game.toString());
		System.out.println("Winner: " + game.playGame());
		
	}

}
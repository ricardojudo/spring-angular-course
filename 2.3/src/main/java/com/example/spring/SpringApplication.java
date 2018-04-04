package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.entities.BasketBallGame;
import com.example.spring.entities.Game;

public class SpringApplication {

	public static void main(String[] args) {

		/*
		 * Obtener objeto Game del contexto de Spring
		 */
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		// Utilizando solamente la clase
		// Game game = applicationContext.getBean(Game.class);

		// Utilizando el nombre y clase
		Game game = applicationContext.getBean("game", Game.class);

		/*
		 * Inspeccionar contexto de Spring
		 */
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

		/*
		 * Imprimir resultado del juego en pantalla
		 */
		System.out.println(game.toString());
		System.out.println("Winner: " + game.playGame());
		
		/*
		 * Imprimir objeto DataSource
		 */
		System.out.println(((BasketBallGame)game).getDataSource());

	}

}

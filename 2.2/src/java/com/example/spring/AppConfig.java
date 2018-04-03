package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring.entities.BasketBallGame;
import com.example.spring.entities.Game;
import com.example.spring.entities.Heat;
import com.example.spring.entities.Lakers;

@Configuration
public class AppConfig {
	
	@Bean
	public Game game() {
		/*
		 * Configurar creacion de objeto Game
		 */
		BasketBallGame game = new BasketBallGame(new Heat(), new Lakers());
		return game;	
	}
	
}

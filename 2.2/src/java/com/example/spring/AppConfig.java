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
	public Game buildGame() {
		/*
		 * Configurar creacion de objeto Game
		 */
		Game game = new BasketBallGame();
		game.setAwayTeam(new Heat());
		game.setHomeTeam(new Lakers());
		return game;	
	}
	
}

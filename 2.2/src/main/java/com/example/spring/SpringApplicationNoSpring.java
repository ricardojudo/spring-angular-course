package com.example.spring;

import com.example.spring.entities.BasketBallGame;
import com.example.spring.entities.Game;
import com.example.spring.entities.Heat;
import com.example.spring.entities.Lakers;

public class SpringApplicationNoSpring {

	public static void main(String[] args) {
		/*
		 * Creacion y configuracion de objeto game
		 */
		Game game = new BasketBallGame(new Heat(), new Lakers());
		game.setAwayTeam(new Heat());
		game.setHomeTeam(new Lakers());

		/*
		 * Imprimir resultado del juego en pantalla
		 */
		System.out.println(game.toString());
		System.out.println("Winner: " + game.playGame());
		
	}

}

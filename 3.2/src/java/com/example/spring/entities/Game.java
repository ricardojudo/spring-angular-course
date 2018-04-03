package com.example.spring.entities;

public interface Game {
	String playGame();

	void setHomeTeam(Team homeTeam);

	void setAwayTeam(Team awayTeam);
}

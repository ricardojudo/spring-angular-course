package com.example.spring.entities;

public class BasketBallGame implements Game {

	private Team homeTeam;
	private Team awayTeam;
	
	@Override
	public String playGame() {		
		return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
	}

	@Override
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	@Override
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}
	
	@Override
	public String toString() {
		return String.format("%s at %s", awayTeam.getName(), homeTeam.getName());
	}
	

}

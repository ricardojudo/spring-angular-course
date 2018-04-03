package com.example.spring.entities;

import javax.sql.DataSource;

public class BasketBallGame implements Game {

	private Team homeTeam;
	private Team awayTeam;
	
	/*
	 * Crear referencia a objeto DataSource
	 */
	private DataSource dataSource;
		
	
	public BasketBallGame(Team homeTeam, Team awayTeam) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	
	/*
	 * Metodo para establecer dataSource
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
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

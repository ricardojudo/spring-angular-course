package com.example.spring.entities;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;

public class BasketBallGame implements Game {

	private Team homeTeam;
	private Team awayTeam;
	
	private DataSource dataSource;
		
	public BasketBallGame() {}
	
	public BasketBallGame(@Qualifier("lakers") Team homeTeam, @Qualifier("heat") Team awayTeam) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	
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

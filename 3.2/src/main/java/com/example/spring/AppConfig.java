package com.example.spring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.spring.entities.BasketBallGame;
import com.example.spring.entities.Game;
import com.example.spring.entities.Team;

@Configuration
/*
 * Buscando componentes en el paquete com.example
 * con la anotacion @ComponentScan
 */
@ComponentScan("com.example")
public class AppConfig {

	/*
	 * Inyectando objeto dataSource con @Autowired
	 */
	@Autowired
	private DataSource dataSource;
	
	
	/*
	 * Inyectado objetos team con @Autowired y resolviendo nombres con @Qualifier
	 */
	@Autowired
	@Qualifier("lakers")
	private Team home;
	
	@Autowired
	@Qualifier("heat")
	private Team away;
	
	
	
	@Bean
	/*
	 * Establecer alcance del bean en prototype
	 */
	//>>
	@Scope("prototype")
	public Game game() {
		BasketBallGame game = new BasketBallGame(home, away);
		game.setDataSource(dataSource);		
		return game;
	}

}

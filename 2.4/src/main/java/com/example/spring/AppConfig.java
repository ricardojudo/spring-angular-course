package com.example.spring;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
	
	/*
	 * Inyectando objetos team con @Resource
	 */
	@Resource
	private Team lakers;
	
	@Resource
	private Team heat;
	
	
	@Bean
	public Game game() {
		//BasketBallGame game = new BasketBallGame(home, away);
		BasketBallGame game = new BasketBallGame(lakers, heat);
		/*
		 * Establecer DataSource
		 */
		game.setDataSource(dataSource);		
		return game;
	}

}

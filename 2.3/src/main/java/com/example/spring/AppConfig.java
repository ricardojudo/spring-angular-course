package com.example.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.spring.entities.BasketBallGame;
import com.example.spring.entities.Game;
import com.example.spring.entities.Heat;
import com.example.spring.entities.Lakers;
import com.example.spring.entities.Team;

@Configuration

/*
 * Incluir configuracion en clase Infrastructure
 */
//>>

public class AppConfig {

	@Bean
	/*
	 * Inyectar Datasource
	 */
	//>>
	public Game game() {
		/*
		 * Configurar creacion de objeto Game
		 */
		BasketBallGame game = null;
		
		/*
		 * Establecer DataSource
		 */
		//>>
		
		return game;
	}

	/*
	 * Configurar creacion de objetos Team para recuperarlos desde el contexto de
	 * Spring
	 */
	//>>
	

}

package com.example.spring;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Infrastructure {
	
	@Bean
	public DataSource gamesDataSource() {
		return new DriverManagerDataSource();
	}
	
}

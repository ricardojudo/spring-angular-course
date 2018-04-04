package com.example.spring.entities;

import org.springframework.stereotype.Component;

/*
 * Indicando que esta clase es candidato para la deteccion automatica de componentes
 */
@Component
public class Heat implements Team {

	@Override
	public String getName() {
		return "Miami Heat";
	}

}

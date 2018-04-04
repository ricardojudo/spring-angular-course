package com.example.spring.entities;

import org.springframework.stereotype.Component;

@Component
public class Bulls implements Team {

	@Override
	public String getName() {
		return "Chicago Bulls";
	}

}

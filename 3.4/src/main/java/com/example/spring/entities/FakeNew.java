package com.example.spring.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FakeNew implements New{

	
	/*
	 * Metodos de ciclo de vida
	 * Constructor
	 * init
	 * end
	 */
	
	public FakeNew() {
		System.out.println("Constructor");
	}
	
	/*
	 * Utilizar anotacion PostConstruct
	 */	
	@PostConstruct
	public void init() {
		System.out.println("Init");
	}
	
	/*
	 * Utilizar anotacion PreDestroy
	 */	
	@PreDestroy
	public void end() {
		System.out.println("End");
	}
	
}

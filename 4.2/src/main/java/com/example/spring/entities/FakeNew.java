package com.example.spring.entities;

import java.util.Date;

public class FakeNew implements New{


	@Override
	public void publish(String title, Date date, String content) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Fake: " +  title);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(content);
		System.out.println(date);
		System.out.println("------------------------------------------------");
		
	}

	
	

	
}

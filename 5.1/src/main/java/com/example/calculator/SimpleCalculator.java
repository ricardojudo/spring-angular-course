package com.example.calculator;

public class SimpleCalculator implements Calculator {

	@Override
	public int add(int a, int b) {		
		return a + b;
	}

	@Override
	public int add(String a, String b) throws NumberFormatException {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}

}

package com.example.calculator;

public interface Calculator {

	int add(int a, int b);

	int add(String a, String b) throws NumberFormatException;

}

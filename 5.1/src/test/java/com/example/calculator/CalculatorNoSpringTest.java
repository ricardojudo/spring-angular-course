package com.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorNoSpringTest {

	/*
	 * Crear metodos add utilizando enfoque de TDD
	 */
	
	
	
	private Calculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new SimpleCalculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals("5 + 1 = 6 ?", 6, calculator.add(5, 1));
	}

	@Test
	public void testAddString() {
		assertEquals("5 + 1 = 6 ?", 6, calculator.add("5", "1"));
	}

	@Test(expected = NumberFormatException.class)
	public void testAddBadStrings() {
		calculator.add("fake", "1");
		fail("Expected NumberFormatException");

	}
}

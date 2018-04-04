package com.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * Indicar que las pruebas seran ejecutadas en un contexto de Spring para JUnit @RunWith y SpringJUnit4ClassRunner
 * Establecer configuracion del contexto con anotacion @ContextConfiguration
 * 
 */

public class CalculatorSpringTest {

	/*
	 * Inyectando dependencia mediante @Autowired
	 */
	
	private Calculator calculator;

	@Before
	public void setUp() throws Exception {
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

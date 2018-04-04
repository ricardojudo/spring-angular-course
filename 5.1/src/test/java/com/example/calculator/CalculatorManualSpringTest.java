package com.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorManualSpringTest {

	private ApplicationContext context;

	private Calculator calculator;

	@Before
	public void setUp() throws Exception {
		/*
		 * Obtener calculadora de contexto de Spring
		 */
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		calculator = context.getBean(Calculator.class);

	}

	@After
	public void tearDown() throws Exception {
		/*
		 * Cerrar contexto de spring
		 */
		((AnnotationConfigApplicationContext) context).close();
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

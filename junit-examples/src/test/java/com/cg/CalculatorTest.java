package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
 
	@Test
	public void calTest() {
		
		
		assertEquals(10,new Calculator().calculate(5, 5));
		

		
	}
	@Test
	public void isPrimeTest() {
		
		assertTrue(new Calculator().isPrime(13));
		assertFalse(new Calculator().isPrime(1));
		assertFalse(new Calculator().isPrime(16));
		
	}
}

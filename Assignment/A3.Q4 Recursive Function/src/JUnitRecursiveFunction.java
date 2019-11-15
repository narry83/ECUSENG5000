/**
 * Assignment 3 -  Question 4 
 * Junit Class to test the RecursiveFunction
 * 
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit Test class to test the  RecursiveFunction 
 *
 */

public class JUnitRecursiveFunction {
	/**
	 * Test 1 - Checks for when n is positive 
	 */	
	@Test
	public void RecursiveFunctionTest() {
		RecursiveFunction power = new RecursiveFunction ();
		double answer = power.recurPowerFunction(10, 2);		
		assertEquals(100.0,answer,0.1);

	}
	
	/**
	 * Test 2 - Checks for when n is negative 
	 */	
	@Test
	public void RecursiveFunctionTest2() {
		RecursiveFunction power = new RecursiveFunction ();
		double answer = power.recurPowerFunction(10, -2);		
		assertEquals(0.01,answer,0.1);

	}
	
	/**
	 * Test 3 - Checks for when n is zero 
	 */	
	@Test
	public void RecursiveFunctionTest3() {
		RecursiveFunction power = new RecursiveFunction ();
		double answer = power.recurPowerFunction(10, 0);		
		assertEquals(1,answer,0.1);

	}

}

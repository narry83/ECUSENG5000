/**
 * Assignment 3 - Question 2 JUnit Method to test the Recursive Linear Search Method to find the Last
 * Occurrence of a Target in an Array
 * 
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit Test class to test the Recursive Linear Search Method to find the Last
 * Occurrence of a Target in an Array
 *
 */
public class JUnitRecursiveLinearSearchTest {
	
	/**
	 * Test 1 - Checks last position of Integer 50 in the Array of Numbers 
	 */	
	@Test
	public void recursiveLinearSearchTest() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		Integer[] arrayOfNumbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 50, 100 };
		int position = jUnit.searchLinear(arrayOfNumbers, 50);
		assertEquals(9,position);
	}
	
	/**
	 * Test 2 - Checks last position of Integer 40 in the Array of Numbers  
	 */	
	@Test
	public void recursiveLinearSearchTest2() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		Integer[] arrayOfNumbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 50, 100 };
		int position = jUnit.searchLinear(arrayOfNumbers, 40);
		assertEquals(3,position);
	}
	
	/**
	 * Test 3 - Checks if Integer 25 is found in the Array of Numbers  
	 */	
	@Test
	public void recursiveLinearSearchTest3() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		Integer[] arrayOfNumbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 50, 100 };
		int position = jUnit.searchLinear(arrayOfNumbers, 25);
		assertEquals(-1,position);
	}
	
	/**
	 * Test 4 - Checks if String Rob is found in the Array of Strings
	 */
	@Test
	public void RecursiveLinearSearchTest4() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		String[] arrayOfNames = { "Sam", "June", "Rob", "David", "Neo", "Brent", "Rob"};
		int position = jUnit.searchLinear(arrayOfNames, "Rob");
		assertEquals(6,position);
	}
	
	/**
	 * Test 5 - Checks if String Sam is found in the Array of Strings
	 */
	@Test
	public void RecursiveLinearSearchTest5() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		String[] arrayOfNames = { "Sam", "June", "Rob", "David", "Neo", "Brent", "Rob"};
		int position = jUnit.searchLinear(arrayOfNames, "Sam");
		assertEquals(0,position);
	}

	/**
	 * Test 6 - Checks if String Karen is found in the Array of Strings
	 */
	@Test
	public void RecursiveLinearSearchTest6() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		String[] arrayOfNames = { "Sam", "June", "Rob", "David", "Neo", "Brent", "Rob"};
		int position = jUnit.searchLinear(arrayOfNames, "Karen");
		assertEquals(-1,position);
	}

}

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JUnitRecursiveLinearSearchTest {

	
	@Test
	public void RecursiveLinearSearchTest() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		Integer[] arrayOfNumbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 50, 100 };
		int position = jUnit.searchLinear(arrayOfNumbers, 50);
		assertEquals(9,position);
	}
	
	@Test
	public void RecursiveLinearSearchTest2() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		Integer[] arrayOfNumbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 50, 100 };
		int position = jUnit.searchLinear(arrayOfNumbers, 40);
		assertEquals(3,position);
	}
	
	@Test
	public void RecursiveLinearSearchTest3() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		Integer[] arrayOfNumbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 50, 100 };
		int position = jUnit.searchLinear(arrayOfNumbers, 25);
		assertEquals(-1,position);
	}
	
	@Test
	public void RecursiveLinearSearchTest4() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		String[] arrayOfNames = { "Sam", "June", "Rob", "David", "Neo", "Brent", "Rob"};
		int position = jUnit.searchLinear(arrayOfNames, "Rob");
		assertEquals(6,position);
	}
	
	@Test
	public void RecursiveLinearSearchTest5() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		String[] arrayOfNames = { "Sam", "June", "Rob", "David", "Neo", "Brent", "Rob"};
		int position = jUnit.searchLinear(arrayOfNames, "Sam");
		assertEquals(0,position);
	}

	@Test
	public void RecursiveLinearSearchTest6() {
		RecursiveLinearSearch jUnit = new RecursiveLinearSearch();
		String[] arrayOfNames = { "Sam", "June", "Rob", "David", "Neo", "Brent", "Rob"};
		int position = jUnit.searchLinear(arrayOfNames, "Karen");
		assertEquals(-1,position);
	}

}

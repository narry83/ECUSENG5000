/**
 * Assignment 3 - Question 1 JUnit method to test the Recursive Repeat Method
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit Test class to test the Recursive Repeat Method
 *
 */
public class JUnitRecursiveRepeatTest {
	
	/**
	 * Test 1 - Repeat Hello.
	 */
	@Test
	public void recursiveRepeatTest() {
		RecursiveRepeat jUnit = new RecursiveRepeat();
		String repeat = jUnit.repeat("Hello");
		assertEquals("HHeelllloo", repeat);
	}

	/**
	 * Test 2 - Repeat SENG.
	 */
	@Test
	public void recursiveRepeatTest2() {
		RecursiveRepeat jUnit = new RecursiveRepeat();
		String repeat = jUnit.repeat("SENG");
		assertEquals("SSEENNGG", repeat);
	}

	/**
	 * Test 3 - Repeat numbers as Strings.
	 */
	@Test
	public void recursiveRepeatTest3() {
		RecursiveRepeat jUnit = new RecursiveRepeat();
		String repeat = jUnit.repeat("123456");
		assertEquals("112233445566", repeat);
	}

}

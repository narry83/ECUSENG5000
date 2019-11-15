import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Assignmnent 3 - Question 1 JUnit method to test the Recursive Repeat Method
 */
public class JUnitRecursiveRepeatTest {

	@Test
	public void recursiveRepeatTest() {
		RecursiveRepeat jUnit= new RecursiveRepeat();
		String repeat = jUnit.repeat("Hello");
		assertEquals("HHeelllloo",repeat);		
	}
	
	@Test
	public void recursiveRepeatTest2() {
		RecursiveRepeat jUnit= new RecursiveRepeat();
		String repeat = jUnit.repeat("SENG");
		assertEquals("SSEENNGG",repeat);		
	}
	
	@Test
	public void recursiveRepeatTest3() {
		RecursiveRepeat jUnit= new RecursiveRepeat();
		String repeat = jUnit.repeat("123456");
		assertEquals("112233445566",repeat);		
	}
	

}

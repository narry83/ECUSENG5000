package JUnit_Test2;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		JUnit_Test2 testAdd= new JUnit_Test2();
		int result = testAdd.add(10, 20);
		assertEquals(30,result);
		
	}

}

package JUnit_Test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JUnit_Test1 testS = new JUnit_Test1();
		int output = testS.square(5);
		assertEquals(25, output);
	}

}

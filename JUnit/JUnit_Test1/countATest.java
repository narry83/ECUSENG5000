package JUnit_Test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		JUnit_Test1 testA = new JUnit_Test1();
		int output = testA.countA("Java");
		assertEquals(2, output);
	}

}

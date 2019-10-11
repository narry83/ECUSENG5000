package JUnit_Test2;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatTest {

	@Test
	public void test() {
		JUnit_Test2 testConcat = new JUnit_Test2();
		String result = testConcat.concat("Hello", "World");
		assertEquals("HelloWorld",result );
	}

}

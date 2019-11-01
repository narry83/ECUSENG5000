/*<listing chapter="4" number="3.2">*/
package KW.CH04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the ParenChecker.
 * 
 * @author Koffman & Wolfgang
 */
public class ParenCheckerTest {

	public ParenCheckerTest() {
	}

	@Test
	public void aCorrectlyBalancedSimpleExpression() {
		String input = "(a + b)";
		assertTrue(ParenChecker.isBalanced(input));
	}
/*
	@Test
	public void aCorrectlyBalancedExpressionUsingMultipleParenTypes() {
		String input = "{[a * (b + c)] / d}";
		assertTrue(ParenChecker.isBalanced(input));
	}

	@Test
	public void anIncorrectlyBalancedExpression() {
		String input = "{x + y]";
		assertFalse(ParenChecker.isBalanced(input));
	}

	@Test
	public void anIncorrectlyBalancedStrangeString() {
		String input = "{[}]";
		assertFalse(ParenChecker.isBalanced(input));
	}

	@Test
	public void aCorrectlyBalancedInvalidExpression() {
		String input = "{[a * + b]}";
		assertTrue(ParenChecker.isBalanced(input));
	}
*/
}

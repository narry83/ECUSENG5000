/**
 * Assignment 3 - Question 4 
 * Driver Class to test the RecursiveFunction Method
 * 
 */
public class RecursiveFunctionTest {
	
	/**
	 * Tests classes recurPowerFunction. Creates an object of the class and
	 * prints on screen the answer after the power function is performed.
	 * 
	 * @param args[] No control parameters
	 */

	public static void main(String[] args) {
		RecursiveFunction power = new RecursiveFunction ();
		double answer = power.recurPowerFunction(10, 2);		
		System.out.println("When X is 10 and N is positive integer 2: " + answer);
		System.out.println("Expected Answer: 100 " + "\n");

		double answer2 = power.recurPowerFunction(10, 0);	
		System.out.println("When X is 10 and N is negative integer 2: " + answer2);
		System.out.println("Expected Answer: 0.01");

	}

}

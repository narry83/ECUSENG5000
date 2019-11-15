/**
 * Assignment 3 - Question 4
 * Class to implement the Recursive Function to find
 * the Power Of to a Number that works for positive & Negative Numbers
 * 
 */
public class RecursiveFunction {

	/**
	 * 
	 * Recursive Function Method to find the Power Of to a Number that works for
	 * positive & Negative Numbers
	 * 
	 * @param x The base number for which the power of is to be raised
	 * @param n The power by which the base number is to be raised
	 * @return x raised to the power n which works for both positive & negative
	 *         numbers
	 * 
	 */
	public static double recurPowerFunction(double x, int n) {
		if (n < 0)
			return (1.0 / recurPowerFunction(x, -n));
		if (n == 0)
			return 1;
		else
			return (x * recurPowerFunction(x, n - 1));
	}

}

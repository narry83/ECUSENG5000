/**
 * Assignment 3 - Question 1
 * Driver class to test the Recursive Repeat Method that returns each
 * character in the Argument String repeated.
 *
 */
public class RecursiveRepeatTest {
	/**
	 * Tests classes RecursiveRepeat. Creates an object of the class and prints on
	 * screen the new String after the Repeat Operation is performed on the input
	 * string.
	 * 
	 * @param args[] No control parameters
	 */
	public static void main(String[] args) {
		RecursiveRepeat recursion = new RecursiveRepeat();
		String input = "Hello";
		String repeat = recursion.repeat(input);
		System.out.println("Output String: " + repeat);
		System.out.println("Expected Output after Repeat: HHeelllloo");
	}
}

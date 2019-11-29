/**
 * Assignment 3 - Question 1
 * A class to implement the Recursive Repeat Method that returns each
 * character in the Argument String repeated.
 *
 */
public class RecursiveRepeat {
	/**
	 * Recursive Repeat Method that returns each character in the Argument String
	 * repeated
	 * 
	 * @param inputString The String on which the repeat operations is to be
	 *                    performed
	 * @return The new String formed after the repeat operation is performed.
	 */
	public static String repeat(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			return "";
		} else {
			char letter= inputString.charAt(0);
			return letter + "" + letter + repeat(inputString.substring(1));
		}
	}

}

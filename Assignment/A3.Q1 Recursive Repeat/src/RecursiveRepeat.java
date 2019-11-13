/**
 * Assignmnent 3 - Question 1 Recursive Repeat Method that returns each
 * character in the Argument String repeated.
 * 
 * @param inputString The String on which the repeat operations is to be
 *                    performed
 * @return The new String formed after the repeat operation is performed.
 */
public class RecursiveRepeat {

	public static String repeat(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			return "";
		} else {
			return inputString.charAt(0) + "" + inputString.charAt(0) + repeat(inputString.substring(1));
		}
	}

}

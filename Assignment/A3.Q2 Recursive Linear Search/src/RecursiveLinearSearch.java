/**
 * Assignmnent 3 - Question 2 Recursive Linear Search Method to find the Last
 * Occurrence of a Target in an Array
 * 
 */

public class RecursiveLinearSearch {
	/**
	 * Helper Method for Recursive Linear Search Method to find the Last Occurrence
	 * of a Target in an Array.
	 * 
	 * @param target The object to be found in the Search
	 * @param list   The array of Objects to Search
	 * @return The index of target if found
	 */

	public static int searchLinear(Object[] list, Object target) {

		return searchLinear(list, list.length - 1, target);
	}

	/**
	 * Recursive Linear Search Method to find the Last Occurrence of a Target in an
	 * Array.
	 * 
	 * @param list   The array of Objects to Search
	 * @param target The object to be found in the Search
	 * @param length The length of the array
	 * @return The actual index of target if found in the array else returns -1 if
	 *         Target not found.
	 * 
	 */
	public static int searchLinear(Object list[], int length, Object target) {

		if (length < 0)
			return -1;
		else if (list[length].equals(target))
			return length;
		else
			return searchLinear(list, length - 1, target);
	}

}

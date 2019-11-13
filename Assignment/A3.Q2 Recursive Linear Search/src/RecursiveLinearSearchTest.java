/**
 * Assignmnent 3 - Question 2 Driver method to test the Recursive Linear Search
 * Method
 */
public class RecursiveLinearSearchTest {
	/**
	 * Tests classes RecursiveLinearSearch. Creates an object of the class and
	 * prints on screen the index of the last Occurent of Target found in the Array.
	 * 
	 * @param args[] No control parameters
	 */
	public static void main(String[] args) {
		RecursiveLinearSearch find = new RecursiveLinearSearch();
		Integer[] arrayOfNumbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 50, 100 };
		int position = find.searchLinear(arrayOfNumbers, 50);
		System.out.println("Last Occurent of Target at position: " + position);
		System.out.println("Expected position of Target: 9");

	}

}

/**
 * Assignment 3 - Question 3 
 * Driver Class to test adding a node Recursively 
 * before the target node.
 * 
 **/
public class RecursiveLinkedListTester {

	/**
	 * Tests classes RecursiveLinkedList. Creates an object of the class and
	 * prints on screen the updated Linked List after the addBefore Operation.
	 * 
	 * @param args[] No control parameters
	 */
	public static void main(String[] args) {
		RecursiveLinkedList<String> myList = new RecursiveLinkedList<String>();
		myList.addBefore("a","");
		myList.addBefore("a","v");
		myList.addBefore("v","a");
		myList.addBefore("a","j");		
		myList.addBefore("v", "s");
		
		System.out.println(myList);

	}

}

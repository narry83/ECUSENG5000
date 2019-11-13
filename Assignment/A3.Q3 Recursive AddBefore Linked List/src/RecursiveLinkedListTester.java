
public class RecursiveLinkedListTester {

	public static void main(String[] args) {
		RecursiveLinkedList<String> myList = new RecursiveLinkedList<String>();
		myList.add("j");
		myList.add("a");
		myList.add("v");
		myList.add("r");
		
		myList.addBefore("v", "s");
		
		System.out.println(myList);

	}

}

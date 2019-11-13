package KW.CH05;

public class LinkedListRecTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListRec<String> myList = new LinkedListRec<String>();
		myList.add("j");
		myList.add("a");
		myList.add("v");
		myList.add("r");
		
		myList.insertBefore("r", "s");
		
		System.out.println(myList);

	}

}

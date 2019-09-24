package KW.CH02;

public class ExamplesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Examples Test = new Examples();
		
		int [] list1 = {10,20,30,40,50};
		int [] list2 = {11,20,35,40,50};
		int [] list3 = {11,11,35,40,50};
		
		// boolean result = Examples.areDifferent(list1, list2);
		 
		 boolean result1 = Examples.areUnique(list3);
		 
		 //int found=Examples.search(list1,20);
			
		//System.out.println("Search Result: "+found);
		System.out.println("Search Result: "+result1);
	}

}

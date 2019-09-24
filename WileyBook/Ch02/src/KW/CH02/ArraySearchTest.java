package KW.CH02;

public class ArraySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ArraySearch Asearch = new ArraySearch();
		int[] list = {10,20,30,40};	
		
		
		int found=Asearch.search(list,120);
		
		
		System.out.println("Search Result: "+found);
		System.out.println("Array Length : "+list.length);
	}

}

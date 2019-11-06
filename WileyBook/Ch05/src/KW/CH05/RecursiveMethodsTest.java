package KW.CH05;

public class RecursiveMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveMethods recur = new RecursiveMethods();
		
		String str1= "Hello World";		
		int len=recur.length(str1);		
		System.out.println(len);
		
		String str2= "Ferrari";
		System.out.println("\n");
		recur.printChars(str2);
		
		String str3= "Lamborghini";
		System.out.println("\n");
		recur.printCharsReverse(str3);
		

	}

}

package Practice;

import java.util.Stack;

public class Ex4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> names = new Stack<String>();
		names.push("Rich");
		names.push("Debbie");
		names.push("Robin");
		names.push("Dustin");
		names.push("Jonathan");
		
		String last = names.peek();
		System.out.println("Last "+last); //Jonathan
		
		String temp = names.pop();
		System.out.println("temp "+temp);//Jonathan
		
		names.push("Philip");
		
		names.push("Jane");
		names.push("Joseph");
		String top = names.pop();
		System.out.println("top "+top);//Joseph
		
		String nextTop = names.peek();
		System.out.println("nextTop "+nextTop);//Jane
		
		while (!names.isEmpty()) {
			System.out.println(names.peek());
			}

	}

}

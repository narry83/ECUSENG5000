package Practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex4_1_1 {

	public static void main(String[] args) {
		Deque stack1 = new ArrayDeque<>();
		Deque stack2 = new ArrayDeque<>();
		Deque stack3 = new ArrayDeque<>();

		int[] numbers = { -1, 15, 23, 44, 4, 99 };

		for (int num = 0; num < numbers.length; num++) {
			stack1.push(numbers[num]);
			stack2.push(numbers[num]);
		}
		
		while(!stack1.isEmpty()) {
			stack3.push(stack1.pop());
			
		}
		
		while(!stack2.isEmpty() && !stack3.isEmpty() ) {
			
			System.out.println(stack2.pop()+"\t"+stack3.pop());
			//stack3.push(stack1.pop());
			
		}

		//System.out.println(stack1.peek());
		//System.out.println(stack2.peek());
		//System.out.println(stack3.peek());

	}

}

package KW.CH04;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class Exercise_4_5_old {

    public static void main(String[] args) {

        /*<exercise chapter="4" section="5" type="programming" number="1">*/
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        Queue<Integer> queue = new ArrayDeque<>();

        int[] numbers = {-1, 15, 23, 44, 4, 99};

        for (int i = 0; i < numbers.length; i++) {
            stack1.push(numbers[i]);
            stack2.push(numbers[i]);
        }

        /*</exercise>*/

        /*<exercise chapter="4" section="5" type="programming" number="2">*/
        while (!stack1.isEmpty()) {
            queue.offer(stack1.pop());
        }
        /*</exercise>*/

        /*<exercise chapter="4" section="5" type="programming" number="3">*/
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop() + "\t" + queue.poll());
        }
        // Expected Output
        // 99      99
        // 4       4
        // 44      44
        // 23      23
        // 15      15
        // -1      -1	
        /*</exercise>*/
    }
}

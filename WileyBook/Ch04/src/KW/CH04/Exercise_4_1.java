package KW.CH04;

import java.util.ArrayDeque;
import java.util.Deque;

public class Exercise_4_1 {

    public static void main(String[] args) {

        /*<exercise chapter="4" section="1" type="programming" number="1">*/
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        Deque<Integer> stack3 = new ArrayDeque<>();

        int[] numbers = {-1, 15, 23, 44, 4, 99};

        for (int i = 0; i < numbers.length; i++) {
            stack1.push(numbers[i]);
            stack2.push(numbers[i]);
        }

        /*</exercise>*/

        /*<exercise chapter="4" section="1" type="programming" number="2">*/
        while (!stack1.isEmpty()) {
            stack3.push(stack1.pop());
        }
        /*</exercise>*/

        /*<exercise chapter="4" section="1" type="programming" number="3">*/
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop() + "\t" + stack3.pop());
        }
        /* Expected Output
        99      -1
        4       15
        44      23
        23      44
        15      4
        -1      99
         */
        /*</exercise>*/
    }
}

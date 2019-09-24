package KW.CH04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringJoiner;

public class Exercise_4_2_1 {

    /*<exercise chapter="4" section="2" type="programming" number="1">*/
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        Deque<String> stack = new ArrayDeque<>();
        for (String word : words) {
            stack.push(word);
        }
        StringJoiner sj = new StringJoiner(" ");
        while (!stack.isEmpty()) {
            sj.add(stack.pop());
        }
        return sj.toString();
    }
    /*</exercise>*/

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter line to be reversed");
            if (in.hasNextLine()) {
                line = in.nextLine();
                System.out.println(reverseWords(line));
            } else {
                break;
            }
        }
    }
}

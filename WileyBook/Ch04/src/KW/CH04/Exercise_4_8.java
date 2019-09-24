package KW.CH04;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercise_4_8 {

    public static void main(String[] args) {

        /*<exercise chapter="4" section="8" type="programming" number="1">*/
        final String IS_NUMERIC = "[+-]?(\\d+(\\.\\d*)?|\\.\\d+)";
        Deque<String> deque = new ArrayDeque<>();
        int numNumeric = 0;
        int numOther = 0;
        Scanner in = new Scanner(System.in);
        String token;
        while (in.hasNext()) {
            token = in.next();
            if (Pattern.matches(IS_NUMERIC, token)) {
                deque.addLast(token);
                numNumeric++;
            } else {
                deque.addFirst(token);
                numOther++;
            }
        }
        /*</exercise>*/

        /*<exercise chapter="4" section="8" type="programming" number="2">*/
        Iterator<String> itr = deque.iterator();
        System.out.println("Strings that are not numeric");
        int i = 0;
        while (i < numOther && itr.hasNext()) {
            System.out.println(itr.next());
            i++;
        }
        System.out.println("Strings that are numbers");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        /*</exercise>*/
    }
}

package KW.CH07;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Random;

public class Exercise_7_7_1 {

    public static void main(String[] args) {

        Random rand = new Random();
        NavigableSet<Integer> s = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            s.add(rand.nextInt(100));
        }
        /*<exercise chapter="7" section="7" type="programming" number="1">*/
        // Display contents of s in normal order
        System.out.println("Normal Order");
        s.forEach(System.out::println);
        // Dispaly contents of s in reverse order
        System.out.println("Reverse Order");
        s.descendingSet().forEach(System.out::println);
        /*</exercise>*/
    }
}

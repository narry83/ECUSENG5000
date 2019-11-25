package KW.CH06;

import java.util.function.Function;

public class Exercise_6_4_3 {
    /*<exercise chapter="6" section="4" type="programming" number="3">*/
    /**
     * Displays values associated with function f in the range specified.
     * @param low the lower bound
     * @param high the upper bound
     * @param step the increment
     * @param f1
     * @param f2
     */
    public static void show(int low, int high, int step, 
            Function<Integer, Double> f1,
            Function<Integer, Double> f2) {
        for (int i = low; i <= high; i += step) {
            System.out.printf("%3d % 2.4f % 2.4f%n", i, f1.apply(i), f2.apply(i));
        }
    }
    
    public static void main(String[] args) {
        show(0, 360, 30, x -> Math.sin(Math.toRadians(x)), x -> Math.cos(Math.toRadians(x)));
    }
    /*</exercise>*/
}

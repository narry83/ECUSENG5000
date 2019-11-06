package KW.CH06;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Exercise_6_4_1_and_2 {
    
    /*<exericse chapter="6" section="4" type="programming" number="1">*/
    static BiFunction<Double, Integer, Double> f1 = (x, n) -> Math.pow(x, n);
    static BiFunction<Double, Integer, Double> f2 = (x, n) -> {
        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    };
    /*</exercise>*/
    
    /*<exercise chapter="6" section="4" type="programming" number="2">*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a double value followed by an int :");
        double x = in.nextDouble();
        int n = in.nextInt();
        double f1Result = f1.apply(x, n);
        double f2Result = f2.apply(x, n);
        System.out.printf("f1(%.1f,%d) = %.1f f2(%.1f,%d) = %.1f Results are the same %s%n",
                x, n, f1Result, x, n, f2Result, f1Result == f2Result ? "Yes" : "No");
    }
    /*</exercise>*/
    

}

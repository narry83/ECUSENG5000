package KW.CH06;
/*<listing chapter="6" number="3">*/

import java.util.Scanner;

@FunctionalInterface
interface MyFunctionType {

    public int apply(int x, int y);
}

public class TestMyFunctionType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        MyFunctionType mFT = (x, y) -> {
            if (x > y) {
                return x;
            }
            return y;
        };
        
        System.out.println("The larger number is : " + mFT.apply(m, n));
    }

}
/*</listing>*/


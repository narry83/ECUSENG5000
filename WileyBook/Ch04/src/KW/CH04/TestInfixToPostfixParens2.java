package KW.CH04;

import java.util.Scanner;

public class TestInfixToPostfixParens2 {

    public static void main(String[] args) {

        String line;
        Scanner in = new Scanner(System.in);
        do {

            System.out.println("Enter an infix expression to evaluate");
            if (in.hasNextLine()) {
                line = in.nextLine();
                try {
                    String result = InfixToPostfixParens2.convert(line);
                    System.out.println("Value is " + result);
                } catch (InfixToPostfixParens2.SyntaxErrorException ex) {
                    System.out.println("Syntax error " + ex.getMessage());
                }
            } else {
                break;
            }
        } while (true);
    }
}

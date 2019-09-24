package KW.CH04;

import java.util.Scanner;

public class TestInfixToPostfixParens {

    public static void main(String[] args) {

        String line;
        Scanner in = new Scanner(System.in);
        do {

            System.out.println("Enter an infix expression to evaluate");
            if (in.hasNextLine()) {
                line = in.nextLine();
                try {
                    String result = InfixToPostfixParens.convert(line);
                    System.out.println("Value is " + result);
                } catch (InfixToPostfixParens.SyntaxErrorException ex) {
                    System.out.println("Syntax error " + ex.getMessage());
                }
            } else {
                break;
            }
        } while (true);
    }
}

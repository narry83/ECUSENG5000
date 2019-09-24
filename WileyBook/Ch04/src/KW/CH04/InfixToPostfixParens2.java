package KW.CH04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.StringJoiner;

/** Translates an infix expression with parentheses
 *  to a postfix expression.
 *  @author Koffman & Wolfgang
 */
public class InfixToPostfixParens2 {
    
    private InfixToPostfixParens2() {}

    // Nested Class
    /** Class to report a syntax error. */
    public static class SyntaxErrorException
            extends Exception {

        /**
         * Construct a SyntaxErrorException with the specified
         * message.
         * @param message The message
         */
        SyntaxErrorException(String message) {
            super(message);
        }
    }
    // Data Fields
    /** The operators */
    private static final String OPERATORS = "-+*/()";
    /**
     * The Pattern to extract tokens
     * A token is either a string of digits (\d+)
     * or a JavaIdentifier
     * or an operator
     */
    private static final String PATTERN =
            "\\d+\\.\\d*|\\d+|\\p{L}[\\p{L}\\p{N}]*|[" + OPERATORS + "]";
    /** The precedence of the operators, matches order of OPERATORS. */
    private static final int[] PRECEDENCE = {1, 1, 2, 2, -1, -1};
    /** The postfix string */

    /**
     * Convert a string from infix to postfix.
     * @param infix The infix expression
     * @throws SyntaxErrorException
     */
    public static String convert(String infix) throws SyntaxErrorException {
        Deque<Character> operatorStack = new ArrayDeque<>();
        StringJoiner postfix = new StringJoiner(" ");
        Scanner scan = new Scanner(infix);
        /*<exercise chapter="4" section="4" type="programming" number="2">*/
        // Flag to indicate that the next token should be an operand
        boolean expectOperand = true;
        /*</exercise>*/
        try {
            // Process each token in the infix string.
            String nextToken;
            while ((nextToken = scan.findInLine(PATTERN)) != null) {
                char firstChar = nextToken.charAt(0);
                // Is it an operand?
                if (Character.isJavaIdentifierStart(firstChar)
                        || Character.isDigit(firstChar)) {
                    /*<exercise chapter="3" section="4" type="programming" number="2">*/
                    // If an operand is detected verify that it is expected
                    // and toggle the flag
                    if (expectOperand) {
                        expectOperand = false;
                    } else {
                        throw new SyntaxErrorException("Unexpected operand");
                    }
                    /*</exercise>*/
                    postfix.add(nextToken);
                } // Is it an operator?
                else if (isOperator(firstChar)) {
                    /*<exercise chapter="3" section="4" type="programming" number="2">*/
                    // If an operator is detected verify that an operand was not expected
                    // and toggle the flag only if operator is not a paren
                    if (firstChar != '(' && firstChar != ')') {
                        if (!expectOperand) {
                            expectOperand = true;
                        } else {
                            throw new SyntaxErrorException("Unexpected operator");
                        }
                    }
                    /*</exercise>*/
                    processOperator(firstChar, operatorStack, postfix);
                } else {
                    throw new SyntaxErrorException("Unexpected Character Encountered: "
                            + firstChar);
                }
            } // End while.
            /*<exercise chapter="3" section="4" type="programming" number="2">*/
            // If an operand is expected, there is a syntax error
            if (expectOperand) {
                throw new SyntaxErrorException("Operand expected");
            }
            // Pop any remaining operators
            // and append them to postfix.
            while (!operatorStack.isEmpty()) {
                char op = operatorStack.pop();
                // Any '(' on the stack is not matched.
                if (op == '(') {
                    throw new SyntaxErrorException(
                            "Unmatched opening parenthesis");
                }
                postfix.add(Character.toString(op));
            }
            // assert: Stack is empty, return result.
            return postfix.toString();
        } catch (EmptyStackException ex) {
            throw new SyntaxErrorException("Syntax Error: The stack is empty");
        }
    }

    /**
     * Method to process operators.
     * @param op The operator
     * @throws EmptyStackException
     */
    private static void processOperator(char op, Deque<Character> operatorStack, 
            StringJoiner postfix) {
        if (operatorStack.isEmpty() || op == '(') {
            operatorStack.push(op);
        } else {
            // Peek the operator stack and
            // let topOp be the top operator.
            char topOp = operatorStack.peek();
            if (precedence(op) > precedence(topOp)) {
                operatorStack.push(op);
            } else {
                // Pop all stacked operators with equal
                // or higher precedence than op.
                while (!operatorStack.isEmpty()
                        && precedence(op) <= precedence(topOp)) {
                    operatorStack.pop();
                    if (topOp == '(') {
                        // Matching '(' popped - exit loop.
                        break;
                    }
                    postfix.add(Character.toString(topOp));
                    if (!operatorStack.isEmpty()) {
                        // Reset topOp.
                        topOp = operatorStack.peek();
                    }
                }

                // assert: Operator stack is empty or
                //         current operator precedence >
                //         top of stack operator precedence.
                if (op != ')') {
                    operatorStack.push(op);
                }
            }
        }
    }

    /**
     * Determine whether a character is an operator.
     * @param ch The character to be tested
     * @return true if ch is an operator
     */
    private static boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch) != -1;
    }

    /**
     * Determine the precedence of an operator.
     * @param op The operator
     * @return the precedence
     */
    private static int precedence(char op) {
        return PRECEDENCE[OPERATORS.indexOf(op)];
    }
}

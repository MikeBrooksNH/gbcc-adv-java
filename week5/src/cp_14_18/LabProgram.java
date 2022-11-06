package cp_14_18;
// Simple integer division - multiple exceptions
/*
Write a program that
- reads integers userNum and divNum as input,
- output the quotient (userNum divided by divNum).
- Use a try block to perform the statements.
- Use a catch block to catch any ArithmeticException
    - output an exception message with the getMessage() method.
- Use another catch block to catch any InputMismatchException
    - output an exception message with the toString() method.

Note:
    ArithmeticException is thrown when a division by zero happens.
    InputMismatchException is thrown when a user enters a value of different data type
         than what is defined in the program.
    Do not include code to throw any exception in the program.

Examples:
    If the input of the program is:
        15 3
    the output of the program is:
        5
    If the input of the program is:
        10 0
    the output of the program is:
        Arithmetic Exception: / by zero
    If the input of the program is:
        15.5 5
    the output of the program is:
        Input Mismatch Exception: java.util.InputMismatchException
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum;
        int divNum;
        int quotient;

        try {
            userNum = scanner.nextInt();
            divNum = scanner.nextInt();

            quotient = userNum / divNum;
            System.out.println(quotient);
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception: " + ae.getMessage());
        } catch (InputMismatchException ime) {
            System.out.println("Input Mismatch Exception: " + ime.toString());
        }
    }

}

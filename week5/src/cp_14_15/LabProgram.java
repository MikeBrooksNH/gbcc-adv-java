package cp_14_15;
// Input errors with zyLabs
/*
Write a program that
- takes in three integers as inputs
- outputs the largest value
- Use a try block to perform all the statements.
- Use a catch block to catch any NoSuchElementException caused by missing inputs.
- Then output
    - The number of inputs read
    - The largest value OR output "No max" if no inputs are read.

Note: Because inputs are pre-entered when running a program in the zyLabs environment, the system
      throws the NoSuchElementException when inputs are missing. Test the program by running the
      program in the Develop mode.

Hint: Use a counter to keep track of the number of inputs read and compare the inputs accordingly
      in the catch block when an exception is caught.


Examples:

    If the input is:

    3 7 5
    the output is:

    7

If the input is:

    3
    the system throws the NoSuchElementException and outputs:

    1 input(s) read:
    Max is 3

If no inputs are entered:

    the system throws the NoSuchElementException and outputs:

    0 input(s) read:
    No max


 */

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LabProgram {
    public static int getmax(int a, int b) {
        int retval = 0;

        if (a > b)
            retval = a;
        else if (b > a)
            retval = b;
        else if (a == b)
            retval = a;

        return retval;
    }

    public static void main(String[] args) throws NoSuchElementException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int val1;
        int val2;
        int val3;
        int max = Integer.MIN_VALUE;
        int inputs = 0;

        try {
            val1 = scanner.nextInt();
            inputs++;
            max = val1;

            val2 = scanner.nextInt();
            inputs++;
            max = getmax(max, val2);

            val3 = scanner.nextInt();
            inputs++;
            max = getmax(max, val3);

            System.out.println(max);
        } catch (NoSuchElementException nse) {
            System.out.println(inputs + " input(s) read:");
            if (max == Integer.MIN_VALUE)
                System.out.println("No max");
            else
                System.out.println("Max is " + max);
        }

    }
}

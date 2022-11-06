package cp_14_16;
// Step counter - exceptions
/*
A pedometer treats walking 2,000 steps as walking 1 mile.
- Write a stepsToMiles() method that
    - takes the number of steps as an integer parameter
    - returns the miles walked as a double.
    - throws an Exception object with the message
        "Exception: Negative step count entered." when the number of steps is negative.

- Complete the main() method that
    - reads the number of steps from a user
    - calls the stepsToMiles() method
    - outputs the returned value from the stepsToMiles() method.
        - Output each floating-point value with two digits after the decimal point
            which can be achieved as follows:
                System.out.printf("%.2f", yourValue);
    - Use a try-catch block to catch any Exception object thrown by the stepsToMiles() method
    - output the exception message.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input of the program is:

5345
the output of the program is:

2.67
Ex: If the input of the program is:

-3850
the output of the program is:

Exception: Negative step count entered.
 */
import java.util.Scanner;

public class LabProgram {
    /* Define your method here */

    public static double stepsToMiles(int steps) throws Exception {
        if (steps < 0) {
            throw new Exception("Exception: Negative step count entered.");
        }
        return steps / 2000.0;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = scanner.nextInt();
        double miles;

        try  {
            miles = stepsToMiles(steps);
            System.out.printf("%.2f\n", miles);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

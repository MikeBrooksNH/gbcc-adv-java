package cp_14_17;
// Exceptions with arrays
/*
Given an array of 10 names, complete the main method that
- outputs the name specified by the array index entered by the user.
- Use a try block to output the name
    - Catch block to catch any ArrayIndexOutOfBoundsException.
    - Output the message from the exception object if an ArrayIndexOutOfBoundsException is caught.
- Output the first element in the array if the index is negative
- The last element if the index is greater than the size of the array.

Hint:
- Format the exception outputs using the getMessage() method from the exception object.
- Do not hard code the exception messages.

Examples:
    If the input of the program is:
        5
    The program outputs:
        Name: Jane

    If the input of the program is:
        12
    The program outputs:
        Exception! Index 12 out of bounds for length 10
        The closest name is: Johnny

    If the input of the program is:
        -2
    The program outputs:
        Exception! Index -2 out of bounds for length 10
        The closest name is: Ryley
 */
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] names = {"Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny"};
        int index;

        index = scnr.nextInt();
        /* Type your code here. */
        try {
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception! " + e.getMessage());
            System.out.print("The closest name is: ");
            if (index >= names.length) {
                System.out.println(names[names.length-1]);
            } else if (index < 0) {
                System.out.println(names[0]);
            }
        }


    }
}

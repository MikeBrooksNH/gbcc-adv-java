package cp_16_20;
// Reverse a string

import java.util.Scanner;

public class LabProgram {

    public static String reverseString(String s) {

        if (s.isEmpty())
            return s; // string is reversed

        // change what the method is being called with
        return reverseString(s.substring(1)) + s.charAt(0);
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input, result;

        input = scnr.nextLine();
        result = reverseString(input);
        System.out.printf("Reverse of \"%s\" is \"%s\".", input, result);
    }
}

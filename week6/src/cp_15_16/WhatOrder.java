package cp_15_16;
/*
Define a generic method called checkOrder() that checks if four items are in ascending, neither, or descending order.
The method should return -1 if the items are in ascending order, 0 if the items are unordered, and 1 if the items are
in descending order.

The program reads four items from input and outputs if the items are ordered. The items can be different types,
including integers, Strings, characters, or doubles.

Examples:

    If the input is:
        bat hat mat sat
        63.2 96.5 100.1 123.5
    The output is:
        Order: -1
        Order: -1
 */


import java.util.Scanner;
import java.util.InputMismatchException;

public class WhatOrder {
    // TODO: Define a generic method called checkOrder() that
    //       takes in four variables of generic type as arguments.
    //       The return type of the method is integer
    public static <T extends Comparable<T>>
    int checkOrder(T a, T b, T c, T d) {
        // Check the order of the input: return -1 for ascending,
        // 0 for neither, 1 for descending
        /* compareTo returns:
                a < b       == less than 0
                a > b       == greater than 0
                a == b      == equal
         */
        int order;

        if ((a.compareTo(b) > 0) && (b.compareTo(c) > 0) && (c.compareTo(d) > 0))
            order = 1;
        else if ((d.compareTo(c) > 0) && (c.compareTo(b) > 0) && (b.compareTo(a) > 0))
            order = -1;
        else
            order = 0;

        return order;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check order of four strings
        System.out.println(
                "Order: " + checkOrder(scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.next())
        );

        // Check order of four doubles
        System.out.println(
                "Order: " + checkOrder(scanner.nextDouble(),
                        scanner.nextDouble(),
                        scanner.nextDouble(),
                        scanner.nextDouble())
        );

    }

}

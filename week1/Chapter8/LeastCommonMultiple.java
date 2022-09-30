import java.util.Scanner;
import java.lang.Math;

public class LeastCommonMultiple {

   // Prompts user to enter positive non-zero number
   public int getPositiveNumber() {
      Scanner scnr = new Scanner(System.in);
      int userNum;

      userNum = 0;

      while (userNum <= 0) {
         System.out.println("Enter a positive number (>0): ");
         userNum = scnr.nextInt();

         if (userNum <= 0) {
            System.out.println("Invalid number.");
         }
      }

      return userNum;
   }

   // Method returns greatest common divisor of two inputs
   public int findGCD(int aVal, int bVal) {
      int numA;
      int numB;

      numA = aVal;
      numB = bVal;

      // Euclid's algorithm
      while (numA != numB) { 
         if (numB > numA) {
            numB = numB - numA;
         } else {
            numA = numA - numB;
         }
      }

      return numA;
   }

   // Method returns least common multiple of two inputs
   public int findLCM(int aVal, int bVal) {
      int lcmVal;

      lcmVal = Math.abs(aVal * bVal) / findGCD(aVal, bVal);

      return lcmVal;
   }

   public static void main(String[] args) {
      int usrNumA;
      int usrNumB;
      int lcmResult;
      LeastCommonMultiple mathPuzzle = new LeastCommonMultiple();

      System.out.println("Enter value for first input");
      usrNumA = mathPuzzle.getPositiveNumber();

      System.out.println("\nEnter value for second input");
      usrNumB = mathPuzzle.getPositiveNumber();

      lcmResult = mathPuzzle.findLCM(usrNumA, usrNumB);

      System.out.println("\nLeast common multiple of " + usrNumA
              + " and " + usrNumB + " is " + lcmResult);
   }
}
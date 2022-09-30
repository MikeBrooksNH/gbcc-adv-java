import java.util.Scanner;

public class NumbersPrinter {
   public int[] getNumbers() {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALUES = 6;             
      int[] values = new int[NUM_VALUES];  
      int i;                                 

      for (i = 0; i < values.length; ++i) {
         values[i] = scnr.nextInt();
      }
      
      return values;
    }
    
   public void printSelectedNumbers() {
      int i;
      int[] numbers = getNumbers();
 

      for (i = 0; i < numbers.length; ++i) {
		System.out.printf("[%d] : ",i);
         if ((numbers[i] % 5) == 0) {
            System.out.print(numbers[i]);   
         }
		System.out.println();
       }
    }
    
   public static void main(String[] args) {
      NumbersPrinter myPrinter = new NumbersPrinter();
      myPrinter.printSelectedNumbers();
   }
}
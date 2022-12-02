package cp_16_22;

import java.util.Scanner;

public class SortAnArray {

   /* Define your method here */
   public static void sortArray(int[] nums) {

      int i;
      int j;
      int temp;      // Temporary variable for swap

      for (i = 1; i < nums.length; ++i) {
         j = i;
         // Insert numbers[i] into sorted part
         // stopping once numbers[i] in correct position
         while (j > 0 && nums[j] < nums[j - 1]) {

            // Swap numbers[j] and numbers[j - 1]
            temp = nums[j];
            nums[j] = nums[j - 1];
            nums[j - 1] = temp;
            --j;
         }
      }
   }


   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[] userNums = new int[scanner.nextInt()];


      for (int i = 0; i < userNums.length; ++i) {
         userNums[i] = scanner.nextInt();
      }
   
      sortArray(userNums);
   
      for (int i = 0; i < userNums.length; ++i) {
         System.out.print(userNums[i] + " ");
      }
   }
}

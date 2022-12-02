package cp_16_23;

import java.util.Scanner;
import java.util.ArrayList;

public class UserIDSorting {

   public static int partition(ArrayList<String> userIDs, int i, int k) {
      int l;
      int h;
      int midpoint;
      String pivot;
      String temp;
      boolean done;

      /* Pick middle element as pivot */
      midpoint = i + (k - i) / 2;
      pivot = userIDs.get(midpoint);

      done = false;
      l = i;
      h = k;

      while (!done) {
         /* Increment l while numbers[l] < pivot */
         while (userIDs.get(l).compareTo(pivot) < 0) {
            ++l;
         }

         /* Decrement h while pivot < numbers[h] */
         while (pivot.compareTo(userIDs.get(h)) < 0) {
            --h;
         }

         /* If there are zero or one items remaining,
            all numbers are partitioned. Return h */
         if (l >= h) {
            done = true;
         }
         else {
            /* Swap numbers[l] and numbers[h],
               update l and h */
            temp = userIDs.get(l);
            userIDs.set(l, userIDs.get(h));
            userIDs.set(h, temp);

            ++l;
            --h;
         }
      }

      return h;
   }

   public static void quicksort(ArrayList<String> userIDs, int i, int k) {
      int j;

      /* Base case: If there are 1 or zero entries to sort,
       partition is already sorted */
      if (i >= k) {
         return;
      }

      /* Partition the data within the array. Value j returned
         from partitioning is location of last item in low partition. */
      j = partition(userIDs, i, k);

      /* Recursively sort low partition (i to j) and
         high partition (j + 1 to k) */
      quicksort(userIDs, i, j);
      quicksort(userIDs, j + 1, k);
   }
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> userIDList = new ArrayList<String>();
      String userID = scanner.next();
      
      while (!userID.equals("-1")) {
         userIDList.add(userID);
         userID = scanner.next();
      }
      
      // Initial call to quicksort 
      quicksort(userIDList, 0, userIDList.size() - 1);

      for (int i = 0; i < userIDList.size(); ++i) {
         System.out.println(userIDList.get(i));
      }
   }
}


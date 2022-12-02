package cp_16_21;

import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

   // TODO: Write method to create and output all permutations of the list of names.
   public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {

      String hold = "";
      if (nameList.isEmpty()) {
         //bagValue = 0;
         for (int i = 0; i < permList.size(); ++i) {
            //bagValue += nameList.get(i).priceDollars;
            System.out.print(permList.get(i) + "  ");
         }
         //System.out.println("= $" + bagValue);

      } else {
         for (int i = 0; i < nameList.size(); ++i) { // item to bag
            // Move item into bag
            hold = permList.get(i);
            permList.remove(i);
            //currBag.add(tmpGroceryItem);

            allPermutations(permList, nameList);

            // Take item out of bag
            permList.add(i, hold);
            permList.remove(nameList.size() - 1);
         }




   /*      for (int i = 0; i < permList.size() - 1; i++) {
            for (int j = 0; j < nameList.size() - 1; j++) {
               if (nameList.get(j).compareTo(permList.get(i)) != 0) {
                  System.out.print(nameList.get(j) + " ");
                  hold = nameList.get(j);
                  nameList.remove(j);
                  allPermutations(permList, nameList);
                  nameList.add(hold);
               }

               //allPermutations(permList,nameList);
            }
            //System.out.println();
         }
         System.out.println();*/
      }

   }
/*      String tmp = "";
      System.out.println();
      //System.out.println(nameList);
      for (int i = 0; i < permList.size(); i++) {
         //System.out.println(permList.get(i) + "\t");
         for(int j = 0; j < nameList.size();j++) {
            ArrayList<String> p = new ArrayList<>();
            ArrayList<String> l = new ArrayList<>();
               System.out.print(" \t" + nameList.get(j));
               p = permList;
               //p.remove(i);
               l = nameList;
               l.remove(j);
               allPermutations(p, l);
            //System.out.println();
         }
      }



   }
*/
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;
      
      // TODO: Read in a list of names; stop when -1 is read. Then call recursive method.
      name = scnr.next();

     while (name.compareTo("-1") != 0) {
        nameList.add(name);
        permList.add(name);
        name = scnr.next();
     }
     allPermutations(permList,nameList);
   }
}

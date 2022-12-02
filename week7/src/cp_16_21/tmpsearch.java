package cp_16_21;

import java.util.ArrayList;
import java.util.Scanner;

public class tmpsearch {

    // TODO: Write method to create and output all permutations of the list of names.
    public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
        String current;
        ArrayList<String> newPermute;
        int len;
        int i;

        len = nameList.size();

        if (len <= 1) {
            // FIXME: Output the permutation count on each line too
            System.out.println("---------- len <= 1 -----------------------");
            //System.out.print(permList);
            //System.out.print(" ");
            System.out.println(nameList.get(0));
            System.out.println("---------------------------------");
        } else {
            // FIXME: Change the loop to output permutations in reverse order
            for (i = 0; i < len-1; ++i) {
                current = nameList.get(i);           // Get next leading character
                System.out.print(current);
                newPermute = new ArrayList<>(nameList.subList(0, i));
                newPermute.addAll(nameList.subList(i + 1, nameList.size()-1));
                ArrayList<String> tmp = new ArrayList<>();
                tmp = permList;
                tmp.add(current);
                // Get the rest of the tail
                System.out.println("\n======================================\n");
                System.out.println("new perm: " + tmp);
                System.out.println("new namelist: "  + newPermute);
                System.out.println("\n======================================\n");
                allPermutations(tmp, newPermute);
            }
        }
    }


        public static void main (String[]args){
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
            allPermutations(permList, nameList);
        }
    }

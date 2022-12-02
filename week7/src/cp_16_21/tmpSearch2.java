package cp_16_21;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class tmpSearch2 {
    // TODO: Write method to create and output all permutations of the list of names.
    public static void perms(ArrayList<String> aList, String indent) {

        indent.concat("   ");
        int i = 0;
        do {
//        for (int i = 0; i < aList.size()-1; i++) {
            if (!aList.isEmpty()) {
                String tmp = aList.remove(i);
                perms(aList, indent);
                System.out.print(indent + tmp + " ");
                aList.add(tmp);
            } //else
                //System.out.println();
            i++;
        } while (i < aList.size()-1);
        //System.out.println();
    }

        public static void recurseList(ArrayList<String> aList) {

            int listSize = aList.size();
            int counter = 0;
            ArrayList<String> tList =new ArrayList<>();
            tList.addAll(aList);

           do {
                //System.out.println("===== List Size = " + listSize + " ==========");
                if (!aList.isEmpty()) {
                    int x = listSize;
                    String tmp = aList.get(x-x);
                    //System.out.print(aList.get(x-x) + " ");
                    aList.remove(x-x);
                    recurseList(aList);
                    System.out.print(tmp + " ");
                    aList.add(0,tmp);
                } else
                    System.out.println();
                counter++;
            } while (counter <= listSize);
           //System.out.println();
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
            //allPermutations(permList, nameList);
            int listSize = permList.size();
            int counter = 0;
            int i = 0;

                do {
                    recurseList(permList);
                    System.out.println();
                    counter++;
                } while (counter <= listSize -1);
        }
    }

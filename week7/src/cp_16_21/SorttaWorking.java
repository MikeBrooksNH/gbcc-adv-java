package cp_16_21;

import java.util.ArrayList;
import java.util.Scanner;

public class SorttaWorking {

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
    public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {

        // itterate through permlist
        String tmp = "";
        int i = 0;
        //do {
        //for (int i = 0; i < permList.size() ; i++) {
            int lastitem;
            System.out.println(permList.get(i) + " ");

            // these steps need to be repeated until all the variations are printed
            if (i == 0)
                lastitem = 0;
            else //if (lastitem == permList.size())
                lastitem = permList.size() -1;
            if (i < permList.size()) {
                ArrayList<String> tmpList = new ArrayList<>();
                tmpList.addAll(nameList.subList(0,lastitem));
                tmpList.addAll(nameList.subList(i+1,lastitem+1));
                perms(tmpList, "   ");

            }
          //  int j = 0;
          //  while (j < nameList.size()) {

            //for (int j = 0;  ; ++j) {
          //      if (nameList.get(j).compareTo(permList.get(i)) != 0) {
          //          perms(tmpList, "   ");
//                    // this removes the same string
//                    tmp = tmpList.get(j);
//                    tmpList.remove(j);
//                    System.out.printf("permlist[%d] = %s and tmpList[%d] = %s\n ", i,permList.get(i), j, tmp );
//                    //System.out.print(nameList.get(j) + " ");
//                    perms(tmpList, "   ");
//                    tmpList.add(tmp);
//                    System.out.println();
           //     }
//                System.out.println();
            //    j++;
           // }
        //    System.out.println();
        //    i++;
       // } while (i < permList.size());


//        for (int i = 0; i < permList.size()-1; i++) {
//            System.out.print(permList.get(i) + " ");
//            if (!nameList.isEmpty()) {
//                tmp = nameList.remove(i);
//                System.out.println(nameList);
//                //allPermutations(permList, nameList);
//           //} else {
//                nameList.add(tmp);
        /*        ArrayList<String> tmpList = new ArrayList<>();

                tmpList.addAll(nameList.subList(0, i));
                tmpList.addAll(nameList.subList(i + 1, nameList.size()));

                String tmp = nameList.get(i);
                //tmpList.remove(i);
                System.out.println(tmpList);
                allPermutations(permList,tmpList);
                tmpList.add(tmp);

         */
//            } // end if
//        } // end for
    } // end method

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
                    System.out.print(aList.get(x-x) + " ");
                    aList.remove(x-x);
                    recurseList(aList);
                    aList.add(0,tmp);
                }
                counter++;
            } while (counter <= listSize);
            System.out.println();



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
                    //System.out.println();
                    counter++;
                } while (counter <= listSize -1);
        }
    }

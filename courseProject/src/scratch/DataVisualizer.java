package scratch;

import java.util.ArrayList;
import java.util.Scanner;

class dataValue {
    private String author;
    private int numTitles;

    public dataValue() {
        this.author = "";
        this.numTitles = 0;
    }

    public dataValue(String name) {
        this.author = name;
        this.numTitles = 0; // aspiring author
    }

    public dataValue(String name, int numBooks) {
        this.author = name;
        this.numTitles = numBooks;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumTitles() {
        return numTitles;
    }

    public void setNumTitles(int numTitles) {
        this.numTitles = numTitles;
    }

}

public class DataVisualizer {

    public static boolean validatePair(String inline) throws Exception {

        String[] input = inline.split(",");
        boolean retval = false;

        //debug section
        /* System.out.println("\t\tParameter: " + inline);
        System.out.println("array elements:");
        for (String i: input) {
            System.out.println(i + " ");
        }
        */

        if (input.length > 2) {
          //  System.out.println("length: " + input.length);
            throw new Exception("Error: Too many commas in input.");
        } else if (inline.lastIndexOf(',') == -1) {
            //System.out.println("last comma is at position: " + inline.lastIndexOf(','));
            throw new Exception("Error: No comma in string.");
        } else {
            try {
                int tmpval = Integer.parseInt(input[1].trim());
                retval = true;
            } catch (Exception e) {
                throw new Exception("Error: Comma not followed by an integer.");
            }
        }
        return retval;
    }

    public static void printTable(ArrayList<dataValue> alist)  {
        for (dataValue el : alist) {
            System.out.printf("%-20s|%23d\n", el.getAuthor(), el.getNumTitles());
        }
    }

    public static void printHist(ArrayList<dataValue> alist)  {
        for (dataValue el : alist) {
            System.out.printf("%20s ", el.getAuthor());
            for (int i = 1; i <= el.getNumTitles(); i++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<dataValue> elements = new ArrayList<dataValue>();



        String[] header = new String[2];
        String rptHeader;
        int maxColWidth = 20;

        // Get the report header
        System.out.println("Enter a title for the data:");
        rptHeader = scanner.nextLine();
        System.out.println("You entered: " + rptHeader +"\n");

        // Get the column headers
        System.out.println("Enter the column 1 header:");
        header[0] = scanner.nextLine();
        System.out.println("You entered: " + header[0] +"\n");

        System.out.println("Enter the column 2 header:");
        header[1] = scanner.nextLine();
        System.out.println("You entered: " + header[1] +"\n");

        // loop until the user wants to break
        while (true) {
            // need to have 2 variables to handle this... 1 to take the input, 1 to split up the input

            System.out.print("Enter a data point (-1 to stop input):");
            String inline = scanner.nextLine();
            String[] input = inline.split(",");

           if (input[0].compareTo("-1") == 0) {
               // no more input
                break;
            } else {
                try {
                    // this either returns true or there is an exception with the appropriate message
                    boolean tmp = validatePair(inline);
                    // to have a nice formatter, we should track the longest string value that's being entered
                    elements.add(new dataValue(input[0], Integer.parseInt(input[1].trim())));
                    System.out.println("Data string: " + input[0]);
                    System.out.println("Data integer: " +  Integer.parseInt(input[1].trim()) + "\n");
                } catch (Exception e) {
                    System.out.println(e.getMessage() + "\n");
                }
           }
       }

        System.out.printf("%33s\n", rptHeader);
        System.out.printf("%-20s|%23s\n", header[0], header[1]);
        System.out.println("--------------------------------------------");
        printTable(elements);
        //System.out.println();
        printHist(elements);

    }
}

import java.util.Scanner;
import java.util.ArrayList;

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

    public static void printTable(ArrayList<String> strList, ArrayList<Integer> intList) {
        for (int i = 0; i < strList.size(); i++) {
            System.out.printf("%-20s|%23d\n", strList.get(i), intList.get(i));
        }
    }

    public static void printHist(ArrayList<String> strList, ArrayList<Integer> intList) {
        for (int i = 0; i < strList.size(); i++) {
            System.out.printf("%20s ", strList.get(i));
            for (int j = 0; j < intList.get(i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //There should be an ArrayList of a class (and until I fully read the requirement that was automatic)
        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<Integer> intList = new ArrayList<Integer>();

        String[] header = new String[2];
        String rptHeader;

        // Get the report header
        System.out.println("Enter a title for the data:");
        rptHeader = scanner.nextLine();
        System.out.println("You entered: " + rptHeader + "\n");

        // Get the column headers
        System.out.println("Enter the column 1 header:");
        header[0] = scanner.nextLine();
        System.out.println("You entered: " + header[0] + "\n");

        System.out.println("Enter the column 2 header:");
        header[1] = scanner.nextLine();
        System.out.println("You entered: " + header[1] + "\n");

        // loop until the user wants to break
        while (true) {
            // need to have 2 variables to handle this... 1 to take the input, 1 to split up the input

            System.out.println("Enter a data point (-1 to stop input):");
            String inline = scanner.nextLine();
            String[] input = inline.split(",");

            if (input[0].compareTo("-1") == 0) {
                // no more input
                System.out.println();
                break;
            } else {
                try {
                    // this either returns true or there is an exception with the appropriate message
                    boolean tmp = validatePair(inline);
                    // to have a nice formatter, we should track the longest string value that's being entered
                    strList.add(input[0]);
                    intList.add(Integer.parseInt(input[1].trim()));
                    System.out.println("Data string: " + input[0]);
                    System.out.println("Data integer: " + Integer.parseInt(input[1].trim()) + "\n");
                } catch (Exception e) {
                    System.out.println(e.getMessage() + "\n");
                }
            }
        }

        System.out.printf("%33s\n", rptHeader);
        System.out.printf("%-20s|%23s\n", header[0], header[1]);
        System.out.println("--------------------------------------------");
        printTable(strList, intList);
        System.out.println();
        printHist(strList, intList);
    }
}

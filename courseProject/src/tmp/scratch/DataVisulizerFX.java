import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {
    /***
     * Determine if the string passed in meets the requirements. If it does not an exception is thrown with the
     * appropriate message. The return value will be true only if there isn't an exception thrown
     * @author Michael Brooks
     * @version 1.0
     * @param inline
     * @return boolean
     * @throws Exception
     */
    public static boolean validatePair(String inline) throws Exception {
        // checks the input and throws an exception with the message set to
        // the appropriate message being asked for

        String[] input = inline.split(","); // split up the line based on commas
        boolean retval = false; // default to not valid - mute except when returning true

        if (input.length > 2) {
            throw new Exception("Error: Too many commas in input.");
        } else if (inline.lastIndexOf(',') == -1) {
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

    /***
     * Short method to print out the data in tabular form
     * @param strList
     * @param intList
     */
    public static void printTable(ArrayList<String> strList, ArrayList<Integer> intList) {
        for (int i = 0; i < strList.size(); i++) {
            System.out.printf("%-20s|%23d\n", strList.get(i), intList.get(i));
        }
    }

    /***
     * Short method to print out the data in a histogram format
     * @param strList
     * @param intList
     */
    public static void printHist(ArrayList<String> strList, ArrayList<Integer> intList) {
        for (int i = 0; i < strList.size(); i++) {
            System.out.printf("%20s ", strList.get(i));
            for (int j = 0; j < intList.get(i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /***
     * Main program that will evaluate input and print out the collected data in both a table and a histogram
     * @param args
     */
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

        // display a header
        System.out.printf("%33s\n", rptHeader);
        System.out.printf("%-20s|%23s\n", header[0], header[1]);
        System.out.println("--------------------------------------------");

        // display the tabular form
        printTable(strList, intList);

        System.out.println();

        // display the histogram form
        printHist(strList, intList);
    }
}

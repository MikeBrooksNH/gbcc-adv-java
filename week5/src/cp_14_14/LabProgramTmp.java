package cp_14_14;
//Parsing food data

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LabProgramTmp {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileByteStream = null;
        /* Type your code here. */
        FileInputStream inStream = null;
        Scanner inFS = null;

        while (true) {
            // keep reading a file name until there is one that exists
            try {
                String fname = scanner.next();          // Read the name of the input file
                inStream = new FileInputStream(fname);  // Open the input file
                inFS = new Scanner(inStream);           // useDelimiter didn't seem to do much good here...
                break;
            } catch (IOException ioe) {
                System.out.println("File was not found, enter another name");
            } catch (Exception e) {
                // something else bad happened, print the message and bail
                System.out.println(e.getMessage());
                // Consider it a disaster...
                System.exit(-1);
            }
        }

        // getting the file read in, since we're using arrays, need the upper bounds
        ArrayList<String> menu = new ArrayList<>();
        int numberOfItems = 0;

        // The file should have the format of:
        // <Category> <item> <Description> <Availability>
        // fields are separated by a tab
        while (inFS.hasNext()) {
            String line = inFS.nextLine();
            menu.add(line);
            numberOfItems++;
        }

        String[] categories = new String[numberOfItems];
        String[] item = new String[numberOfItems];
        String[] desc = new String[numberOfItems];
        String[] availability = new String[numberOfItems];

        int i = 0;
        for (String lineItem : menu) {
            String[] fields = lineItem.split("\t"); // the fields are supposed to be separated with tabs

            // parallel arrays...
            categories[i] = fields[0];
            item[i] = fields[1];
            desc[i] = fields[2];
            availability[i] = fields[3];

            // check if the item is available to show on the menu
            if (availability[i].compareTo("Available") == 0)
                System.out.println(item[i] + " (" + categories[i] + ") " + "-- " + desc[i]);

            // increment the indexes
            i++;
        }
     }
}

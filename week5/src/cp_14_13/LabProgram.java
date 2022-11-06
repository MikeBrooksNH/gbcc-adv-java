package cp_14_13;
// File name change

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Declare required variables
        FileInputStream inStream = null;
        Scanner inFS = null;

        while (true) {
            // keep reading a file name until there is one that exists
            try {
                String fname = scanner.next();          // Read the name of the input file
                inStream = new FileInputStream(fname);  // Open the input file
                inFS = new Scanner(inStream);
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

        // For each line of the input file, read the file name
        // on that line and output the modified file name
        while (inFS.hasNext()) {
            String newfileName = inFS.nextLine().replace("_photo.jpg", "_info.txt");
            System.out.println(newfileName);
        }
    }
}


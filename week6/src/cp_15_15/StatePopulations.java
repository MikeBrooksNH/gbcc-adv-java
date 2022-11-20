package cp_15_15;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class StatePopulations {

    public static void fillArray1(ArrayList<StatePair<Integer, String>> statePairs,
                                  Scanner inFS) {
        StatePair<Integer, String> pair;
        int intValue;
        String stringValue;

        while (inFS.hasNextLine()) {
            intValue = inFS.nextInt();
            stringValue = inFS.next();
            pair = new StatePair<Integer, String>(intValue, stringValue);
            statePairs.add(pair);

        }

    }

    public static void fillArray2(ArrayList<StatePair<String, String>> statePairs,
                                  Scanner inFS) {
        StatePair<String, String> pair;
        String stringValue1;
        String stringValue2;

        while (inFS.hasNextLine()) {
            stringValue1 = inFS.next();
            inFS.nextLine();
            stringValue2 = inFS.nextLine();
            pair = new StatePair<String, String>(stringValue1, stringValue2);
            statePairs.add(pair);
        }
    }

    public static void fillArray3(ArrayList<StatePair<String, Integer>> statePairs,
                                  Scanner inFS) {
        StatePair<String, Integer> pair;
        String stringValue;
        int intValue;

        while (inFS.hasNextLine()) {
            stringValue = inFS.nextLine();
            intValue = inFS.nextInt();
            inFS.nextLine();
            pair = new StatePair<String, Integer>(stringValue, intValue);
            statePairs.add(pair);
        }

    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object
        int i;

        // ZIP code - state abbrev. pairs
        ArrayList<StatePair<Integer, String>> zipCodeState = new ArrayList<StatePair<Integer, String>>();

        // state abbrev. - state name pairs
        ArrayList<StatePair<String, String>> abbrevState = new ArrayList<StatePair<String, String>>();

        // state name - population pairs
        ArrayList<StatePair<String, Integer>> statePopulation = new ArrayList<StatePair<String, Integer>>();

        HashMap<Integer, String> zipMap = new HashMap<Integer, String>();
        HashMap<String, String> stateAbbrevMap = new HashMap<String, String>();
        HashMap<String, Integer> populationMap = new HashMap<String, Integer>();


        // Fill the three ArrayLists
        while (true) {
            try {
                // Try to open zip_code_state.txt file
                fileByteStream = new FileInputStream("zip_code_state.txt");
                inFS = new Scanner(fileByteStream);
                fillArray1(zipCodeState, inFS);
                fileByteStream.close(); // close() may throw IOException if fails
                break;
            } catch (IOException ioe) {
                System.out.println("There was a problem with that file. Please enter another filename");
            }
        }

        while (true) {
            try {
                // Try to open abbreviation_state.txt file
                fileByteStream = new FileInputStream("abbreviation_state.txt");
                inFS = new Scanner(fileByteStream);
                fillArray2(abbrevState, inFS);
                fileByteStream.close();
                break;
            } catch (IOException ioe) {
                System.out.println("There was a problem with that file. Please enter another filename");
            }
        }

        while (true) {
            try {
                // Try to open state_population.txt file
                fileByteStream = new FileInputStream("state_population.txt");
                inFS = new Scanner(fileByteStream);
                fillArray3(statePopulation, inFS);
                fileByteStream.close();
                break;
            } catch (IOException ioe) {
                System.out.println("There was a problem with that file. Please enter another filename");
            }
        }


        // to hash
        for (StatePair<Integer, String> zip : zipCodeState) {
            zipMap.putIfAbsent(zip.getValue1(), zip.getValue2());
        }
        for (StatePair<String, String> abbrev : abbrevState) {
            stateAbbrevMap.putIfAbsent(abbrev.getValue1(), abbrev.getValue2());
        }

        for (StatePair<String, Integer> population : statePopulation) {
            populationMap.putIfAbsent(population.getValue1(), population.getValue2());
        }

        int myZip = scanner.nextInt();


        String outstr = stateAbbrevMap.get(zipMap.get(myZip)) + ": " +
                populationMap.get(stateAbbrevMap.get(zipMap.get(myZip)));

        if (outstr.compareTo("null: null") == 0) {
            System.out.println("invalid zip code");
        } else {
            System.out.println(stateAbbrevMap.get(zipMap.get(myZip)) + ": " +
                    populationMap.get(stateAbbrevMap.get(zipMap.get(myZip))));
            // leaving this in for (my) future reference
            // System.out.printf("%s: %,d\n", stateAbbrevMap.get(zipMap.get(myZip)),
            //        populationMap.get(stateAbbrevMap.get(zipMap.get(myZip))));
        }

    }
}

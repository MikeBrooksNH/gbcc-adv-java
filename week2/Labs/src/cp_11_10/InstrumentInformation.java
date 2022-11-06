package cp_11_10;

import java.util.Scanner;
public class InstrumentInformation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String instrumentName, manufacturer, stringName, stringManufacturer;
        int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;

        instrumentName = scanner.nextLine();
        manufacturer = scanner.nextLine();
        yearBuilt = scanner.nextInt();
        scanner.nextLine();
        cost = scanner.nextInt();
        scanner.nextLine();
        stringName = scanner.nextLine();
        stringManufacturer = scanner.nextLine();
        stringYearBuilt = scanner.nextInt();
        stringCost = scanner.nextInt();
        numStrings = scanner.nextInt();
        numFrets = scanner.nextInt();

        Instrument instrument = new Instrument(instrumentName, manufacturer, yearBuilt, cost);
        System.out.println(instrument);

        StringInstrument stringInstrument = new StringInstrument(stringName, stringManufacturer, stringYearBuilt,
                stringCost, numStrings, numFrets);
        System.out.println(stringInstrument);
    }

}

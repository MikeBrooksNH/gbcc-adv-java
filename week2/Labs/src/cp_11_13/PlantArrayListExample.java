package cp_11_13;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

    public static void PrintArrayList(ArrayList<Object> garden) {
        for (Object obj : garden) {
            System.out.println(obj.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        ArrayList<Object> myGarden = new ArrayList<Object>();

        String plantName, plantCost, colorOfFlowers;
        boolean isAnnual;

        input = scanner.next();
        while(!input.equals("-1")){
            input.toLowerCase(); // avoiding case issues...

            if (input.compareTo("plant") == 0) {
                Plant aPlant = new Plant();
                aPlant.setPlantName(scanner.next());
                aPlant.setPlantCost(scanner.next());
                myGarden.add(aPlant);
            } else if (input.compareTo("flower") == 0) {
                Flower aFlower = new Flower();
                aFlower.setPlantName(scanner.next());
                aFlower.setPlantCost(scanner.next());
                aFlower.setPlantType(scanner.nextBoolean());
                aFlower.setColorOfFlowers(scanner.next());
                myGarden.add(aFlower);
            }
            input = scanner.next();

        }
        PrintArrayList(myGarden);
    }
}

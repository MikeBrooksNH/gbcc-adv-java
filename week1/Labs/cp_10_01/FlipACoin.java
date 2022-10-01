package cp_10_01;

import java.util.Scanner;
import java.util.Random;

public class FlipACoin {

    private static final Random rand = new Random(2); // Unique seed
    private static final Scanner scanner = new Scanner(System.in);

    public static String headsOrTails() {
        int tmp = rand.nextInt(2);

        if (tmp == 1)
            return ("heads");
        else
            return("tails");
    }

    public static void main(String[] args) {

        FlipACoin heads_tails = new FlipACoin();
        int numFlips = scanner.nextInt();
        for (int i = 0; i < numFlips; i++)
            System.out.println(FlipACoin.headsOrTails());

    }
}

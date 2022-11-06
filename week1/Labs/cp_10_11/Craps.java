package cp_10_11;

import java.util.Scanner;

public class Craps {

    public static  int diceRoll (Die d1, Die d2) {
        d1.roll();
        d2.roll();
        return d1.getValue() + d2.getValue();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int credits;
        int seed;

        Die die1 = new Die();
        Die die2 = new Die();

        // Read random seed to support testing (do not alter)
        seed = scanner.nextInt();
        die1.setSeed(seed);

        // Read starting credits
        credits = scanner.nextInt();

        /* Insert your code here */
        int rollTotal;
        int goal = 0;
        int rounds = 0;

        while (credits > 0) { // loop until there are no more credits

            // Don't repoeat yourself - roll and total
            rollTotal = diceRoll(die1, die2);

            // step 1 - check for 7 or 11 to add / 2, 3, 12 to subtract
            switch (rollTotal) {
                case (7):
                case (11):
                    credits++;
                    break;
                case (2):
                case (3):
                case (12):
                    credits--;
                    break;
                default:
                    goal = rollTotal; // neiter add or subtract, set the goal
                    break;
            }
            // display the total
            System.out.println("Dice total: " + rollTotal);
            if (goal == 0) {
                System.out.println("Credits: " + credits);
                break;
            }
            // goal was set in the previous roll
            while (goal != -1) {
                // Don't repoeat yourself - roll and total
                rollTotal = diceRoll(die1, die2);

                // check for a win or loss
                if (rollTotal == 7) {
                    credits--;
                    goal = -1;
                } else if (rollTotal == goal) {
                    credits++;
                    goal = -1;
                }
               // display the total
                System.out.println("Dice total: " + rollTotal);
            }
            rounds++;
            // display the credits
            System.out.println("Credits: " + credits);
        }
        System.out.println("Rounds: " + rounds);

    }
}

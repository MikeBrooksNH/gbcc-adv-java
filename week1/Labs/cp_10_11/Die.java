package cp_10_11;

import java.util.*;

public class Die implements Comparable <Die> {

    // Static members are shared across all instances of class GVDie
    private static Random rand = new Random();
    private int myValue;

    // Set initial die value
    public Die() {
        myValue = rand.nextInt(6) + 1;
    }

    // Roll the die to get 1 - 6
    public void roll () {
        myValue = rand.nextInt(6) + 1;
    }

    // Return current die value
    public int getValue() {
        return myValue;
    }

    // Set the random number generator seed to support testing
    public void setSeed(int seed) {
        rand.setSeed(seed);
    }

    // Allows dice to be compared if necessary
    public int compareTo(Die d) {
        return getValue() - d.getValue();
    }

}
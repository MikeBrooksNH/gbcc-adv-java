/*
In the file RandomNumbers.java, write a class called RandomNumbers that has three integer instance variables:
var1, var2, and var3. Write getter method for each variable: getVar1(), getVar2() and getVar3(). Then
 write the following 2 instance methods:

setRandomValues( ) - accepts a low and high integer values as parameters, and sets var1, var2, and var3
to random numbers (generated using the Random class) within the range of the low and high input values
(inclusive).

getRandomValues( ) - prints out the 3 random numbers in the format: "Random values: var1 var2 var3"

*/
package cp_10_03;


import java.util.Random;

public class RandomNumbers {

    //declare private member variables and related
    //accessor methods
    private int var1;
    private int var2;
    private int var3;

    // getters
    public int getVar1() {
        return var1;
    }
    public int getVar2() {
        return var2;
    }
    public int getVar3() {
        return var3;
    }

    // other methods
    public void setRandomValues(int low, int high) {
        Random rand = new Random(); // Unique seed
        int bounds = high - low;
        if (bounds == 0)
            bounds = 1;

        this.var1 =  rand.nextInt(bounds) + low;
        this.var2 =  rand.nextInt(bounds) + low;
        this.var3 =   rand.nextInt(bounds) + low;
    }

    public void getRandomValues() {
        System.out.println("Random values: " + getVar1() + " " + getVar2() + " " + getVar3());
    }
}


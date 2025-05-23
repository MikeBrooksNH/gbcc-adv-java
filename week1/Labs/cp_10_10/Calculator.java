package cp_10_10;

import java.util.Scanner;

public class Calculator {


    private double value;

    public Calculator() {
        this.value = 0.0;
    }

    public double getValue( ) {
        return (this.value);
    }

    public void clear() {
        this.value = 0.0;
    }

    public void add(double val) {
        this.value += val;
    }

    public void subtract(double val) {
        this.value -= val;
    }

    public void multiply(double val) {
        this.value *= val;
    }

    public void divide(double val) {
        this.value /= val;
    }


    public static void main(String[] args) {
        //Uncomment statement lines below once you've added the missing fields, constructors and methods
        Calculator calc = new Calculator();

        Scanner keyboard = new Scanner(System.in);
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();

        // 1. The initial value
        System.out.println(calc.getValue());

        // 2. The value after adding num1
        calc.add(num1);
        System.out.println(calc.getValue());

        // 3. The value after multiplying by 3
        calc.multiply(3);
        System.out.println(calc.getValue());

        // 4. The value after subtracting num2
        calc.subtract(num2);
        System.out.println(calc.getValue());

        // 5. The value after dividing by 2
        calc.divide(2);
        System.out.println(calc.getValue());

        // 6. The value after calling the clear() method
        calc.clear();
        System.out.println(calc.getValue());
    }
}

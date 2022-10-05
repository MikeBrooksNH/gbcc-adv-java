package cp_10_04;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SimpleCar car = new SimpleCar();
        car.drive(scnr.nextInt());
        car.reverse(scnr.nextInt());
        car.honkHorn();
        car.report();
    }
}

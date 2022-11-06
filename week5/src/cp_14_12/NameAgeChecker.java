package cp_14_12;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputName;
        int age = 0;

        inputName = scanner.next();
        while (!inputName.equals("-1")) {
            try {
                age = scanner.nextInt();
                System.out.println(inputName + " " + (age + 1));
            } catch (InputMismatchException e) {
                System.out.println(inputName + " 0");
                inputName = scanner.nextLine();
            }
            inputName = scanner.next();
        }
    }
}

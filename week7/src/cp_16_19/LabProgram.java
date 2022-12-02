package cp_16_19;
// Drawing an upside down triangle

import java.util.Scanner;

public class LabProgram {

    public static void drawTriangle(int base) {

        // This is the field width we are constrained to
        int width = 20;

        // compute the padding being used
        int pad = (width + base) / 2;

        // Create a string containing the "base" number of asterisks
        String out = "*".repeat(base);

        // Apply a format that is equal to the padding
        String fmt = String.format("%" + pad + "s", out);

        // Output the formatted string
        System.out.println(fmt);

        if (base > 1) {
            drawTriangle(base - 2);
        }
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int baseLength;

        baseLength = scnr.nextInt();
        drawTriangle(baseLength);
    }
}

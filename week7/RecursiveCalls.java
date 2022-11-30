public class RecursiveCalls {

    public static int convertToBinary(int num) {

        if (num == 0) {

            return 0;

        }

        else {

            return (num % 2 + 10 * convertToBinary(num / 2));

        }

    }

    public static void main (String [] args) {

        System.out.print("The Binary number is: ");

        System.out.println(convertToBinary(7));

    }

}

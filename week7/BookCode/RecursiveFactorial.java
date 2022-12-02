public class RecursiveFactorial {
    public static int sum(int n, String indentAmt) {
        int sum = 0;

        if (n == 0) {
            System.out.println(indentAmt + "your value is: " + n);
            return 0;
        } else {
            System.out.println(indentAmt + "your value is: " + n);
            sum = n + sum(n - 1, indentAmt + "   ");
        }

        System.out.println(indentAmt + "Returning pos = " + n);
        return sum;
    }

    public static int factorial(int value) {
        if (value <= 0) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }

    public static void main (String [] args) {
        int userVal = 10;
        System.out.println("Factorial = " + factorial(userVal));
        sum(100,"  ");
    }

}


public class PrimeChecker {
    // Returns 0 if value is not prime, 1 if value is prime
    public static int isPrime(int testVal, int divVal) {
        // Base case 1: 0 and 1 are not prime, testVal is not prime

        // Base case 2: testVal only divisible by 1, testVal is prime
        boolean primeVal = false;
        for (int i = 1; i <= testVal; i++) {
            if (i > 0) {
                System.out.printf("\t%d MOD %d\n", testVal, i);
                if ((testVal % i) == 0) {
                    primeVal = true;
                }
            }
        }
        // Recursive Case
        // Check if testVal can be evenly divided by divVal
        // Hint: use the % operator

        // If not, recursive call to isPrime with testVal and (divVal - 1)
        if (primeVal)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        int primeCheckVal;     // Value checked for prime

        // Check primes for values 1 to 10
        for (primeCheckVal = 1; primeCheckVal <= 10; ++primeCheckVal) {
            if (isPrime(primeCheckVal, (primeCheckVal - 1)) == 1) {
                System.out.println(primeCheckVal + " is prime.");
            }
            else {
                System.out.println(primeCheckVal + " is not prime.");
            }
        }
    }
}

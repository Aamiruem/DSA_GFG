package DSA_GFG.L01Mathematics;

public class L19LargestPrimeFactor {

    // Method to find the largest prime factor
    public static long largestPrimeFactor(long n) {
        // Initialize the largest prime factor
        long largestPrime = -1;

        // Remove all factors of 2
        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }

        // Check for odd factors starting from 3
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n /= i;
            }
        }

        // This condition is to handle the case when n is a prime number greater than 2
        if (n > 2) {
            largestPrime = n;
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        long number = 133;
        System.out.println("The largest prime factor of " + number + " is: " + largestPrimeFactor(number));
    }
}

package DSA_GFG.L01Mathematics;

import java.util.Arrays;

public class L24SieveOfEratosthenes {

    // Method to perform the Sieve of Eratosthenes and return an array of primes
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1]; // Array to track prime status
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially
        isPrime[0] = false; // 0 is not a prime number
        isPrime[1] = false; // 1 is not a prime number

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    // Method to print all prime numbers up to a given limit using the Sieve of Eratosthenes
    public static void printPrimesUpTo(int n) {
        boolean[] isPrime = sieveOfEratosthenes(n);

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 100; // Limit to find prime numbers
        printPrimesUpTo(n);
    }

}

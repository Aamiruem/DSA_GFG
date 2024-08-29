package DSA_GFG.L01Mathematics;

import java.util.Arrays;

public class L25SumOfAllPrimeNumbers {
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

    // Method to calculate the sum of all prime numbers up to a given limit
    public static int sumOfAllPrimes(int n) {
        boolean[] isPrime = sieveOfEratosthenes(n);
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 100; // You can change this limit to find the sum of primes up to a different value
        int sum = sumOfAllPrimes(n);
        System.out.println("The sum of all prime numbers between 1 and " + n + " is: " + sum);
    }
}

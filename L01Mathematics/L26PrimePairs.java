package DSA_GFG.L01Mathematics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L26PrimePairs {

    // Method to perform the Sieve of Eratosthenes and return an array of primes
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    // Method to find all pairs of prime numbers that sum up to N
    public static void findPrimePairs(int N) {
        if (N < 4) {
            System.out.println("No pairs of prime numbers found for the given number.");
            return;
        }

        boolean[] isPrime = sieveOfEratosthenes(N);
        Set<Integer> primes = new HashSet<>();

        // Collect all primes up to N
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        System.out.println("Prime pairs that sum up to " + N + ":");
        for (int prime : primes) {
            int complement = N - prime;
            if (complement >= prime && primes.contains(complement)) {
                System.out.println("(" + prime + ", " + complement + ")");
            }
        }
    }

    public static void main(String[] args) {
        int N = 50; // You can change this limit to find pairs that sum up to a different value
        findPrimePairs(N);
    }
}

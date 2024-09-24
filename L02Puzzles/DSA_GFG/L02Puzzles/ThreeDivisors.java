package DSA_GFG.L02Puzzles;

import java.util.*;

public class ThreeDivisors {

    // Function to pre compute primes up to 10^6 using Sieve of Eratosthenes
    private static List<Integer> sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    // Function to solve the queries
    public static List<Integer> threeDivisors(int q, long[] queries) {
        int limit = 1000000; // 10^6
        List<Integer> primes = sieveOfEratosthenes(limit);

        // Pre compute all squares of primes
        List<Long> squaresOfPrimes = new ArrayList<>();
        for (int prime : primes) {
            long square = (long) prime * prime;
            squaresOfPrimes.add(square);
        }

        // Answer the queries
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            long N = queries[i];
            // Count how many squares of primes are <= N
            int count = 0;
            for (long square : squaresOfPrimes) {
                if (square > N)
                    break;
                count++;
            }
            results.add(count);
        }

        return results;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example input
        int q = 2;
        long[] queries = { 6, 10 };

        List<Integer> results = threeDivisors(q, queries);
        for (int res : results) {
            System.out.println(res);
        }
    }
}

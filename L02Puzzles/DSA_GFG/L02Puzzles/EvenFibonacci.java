// Input: n = 1
// Output: 2 
// Explanation: 2 is the first even
// number in the fibonacci series.
// Example 2:

// Input: n = 2
// Output: 8
// Explanation: 8 is the second even
// number in the fibonacci series.


// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(n)



package DSA_GFG.L02Puzzles;

public class EvenFibonacci {
    private static final int MOD = 1000000007;

    public long nthEvenFibonacci(long n) {
        if (n == 1)
            return 2; // The first even Fibonacci number is 2
        if (n == 2)
            return 8; // The second even Fibonacci number is 8

        long a = 2; // E1
        long b = 8; // E2
        long result = 0;

        // Use the recurrence relation to compute the Nth even Fibonacci number
        for (long i = 3; i <= n; i++) {
            result = (4 * b % MOD + a % MOD) % MOD;
            a = b;
            b = result;
        }

        return result;
    }
    public static void main(String[] args) {
        EvenFibonacci obj = new EvenFibonacci();
        long N = 1;
        long result = obj.nthEvenFibonacci(N);
        System.out.println(result);
    }
}

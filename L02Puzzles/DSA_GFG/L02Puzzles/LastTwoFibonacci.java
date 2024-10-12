// Input:
// N = 13
// Output:
// 33
// Explanation:
// The 13th Fibonacci number is 233.
// So last two digits are 3 and 3.
// Example 2:

// Input:
// N = 255
// Output:
// 70
// Explanation:
// The 255th fibonacci number is  875715953430-
// 18854458033386304178158174356588264390370.
// Thus, last two digits are 7 and 0.


// Expected Time Complexity:O(K)
// Expected Auxillary Space:O(K)  where K is of the order 102.


package DSA_GFG.L02Puzzles;

public class LastTwoFibonacci {
    public int fibonacciDigits(long N) {
        // Pisano period for mod 100 is 300
        int pisanoPeriod = 300;

        // Reduce N using the Pisano period
        N = N % pisanoPeriod;

        // If N is 0, we return 0 as the last two digits
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;

        // Variables to store the last two Fibonacci numbers mod 100
        int a = 0; // F(0)
        int b = 1; // F(1)
        int result = 0;

        // Iteratively calculate Fibonacci numbers modulo 100
        for (int i = 2; i <= N; i++) {
            result = (a + b) % 100;
            a = b;
            b = result;
        }

        // Return the last two digits of the Nth Fibonacci number
        return result;
    }

    public static void main(String[] args) {
        LastTwoFibonacci obj = new LastTwoFibonacci();
        long N = 13;
        int result = obj.fibonacciDigits(N);
        System.out.println(result);
    }
}

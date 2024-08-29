package DSA_GFG.L01Mathematics;

import java.util.HashMap;
import java.util.Map;

public class L32FibonacciMemoization {

    private static Map<Integer, Integer> memo = new HashMap<>();

    // Method to compute Fibonacci number using memoization
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 10; // Example to find the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}

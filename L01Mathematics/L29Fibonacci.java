// iterative

package DSA_GFG.L01Mathematics;

public class L29Fibonacci {

    // Method to calculate the nth Fibonacci number using iteration
    public static long fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to find a different Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciIterative(n));
    }

}

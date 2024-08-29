package DSA_GFG.L01Mathematics;

public class L31FibonacciIterative {

    // Method to compute Fibonacci number iteratively
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 10; // Example to find the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}

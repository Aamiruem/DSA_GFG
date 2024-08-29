package DSA_GFG.L01Mathematics;

public class L30FibonacciRecursive {

    // Method to compute Fibonacci number recursively
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Example to find the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}

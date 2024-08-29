package DSA_GFG.L01Mathematics;

public class L17Permutation {

    // Method to compute factorial of a number
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to compute nPr
    public static long nPr(int n, int r) {
        if (n < r) {
            throw new IllegalArgumentException("n must be greater than or equal to r");
        }
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        System.out.println("nPr of " + n + " and " + r + " is: " + nPr(n, r));
    }

}

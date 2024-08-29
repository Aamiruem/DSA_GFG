package DSA_GFG.L01Mathematics;

public class L22NthRoot {

    // Method to find the nth root of M
    public static double nthRoot(double M, int n) {
        return Math.pow(M, 1.0 / n);
    }

    public static void main(String[] args) {
        double M = 27; // The number to find the nth root of
        int n = 3;     // The root to find (e.g., cube root)

        double result = nthRoot(M, n);
        System.out.println("The " + n + "th root of " + M + " is: " + result);
    }
}

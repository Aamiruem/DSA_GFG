package DSA_GFG.L01Mathematics;
public class L12GCD {

    public static int gcd(int a, int b) {
        // Base case: if b is 0, gcd is a
        if (b == 0) {
            return a;
        }
        // Recursively apply the Euclidean algorithm
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Test the function
        int a = 10, b = 15;
        System.out.println("GCD of " + a + " and " + b + " is: " + L12GCD.gcd(a, b));
    }

}

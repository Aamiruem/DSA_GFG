// package DSA_GFG.L01Mathematics;

// public class L14AddTwoFractions {

//     public static void main(String[] args) {

//         int a = 1, b = 2, c = 3, d = 4;

//         System.out.println("Sum of fractions: " + L14AddTwoFractions.addFraction(a, b, c, d));

//     }

//     public static String addFraction(int a, int b, int c, int d) {

//         int num = (a * d) + (c * b);

//         int den = b * d;

//         int gcd = L12GCD.gcd(num, den);

//         num = num / gcd;

//         den = den / gcd;

//         return num + "/" + den;

//     }
// }













package DSA_GFG.L01Mathematics;

public class L14AddTwoFractions {

    public static String addFractions(int num1, int den1, int num2, int den2) {
        // Calculate the numerator and denominator of the resulting fraction
        int resultNum = num1 * den2 + num2 * den1;
        int resultDen = den1 * den2;
        
        // Simplify the fraction
        int gcd = gcd(resultNum, resultDen);
        resultNum /= gcd;
        resultDen /= gcd;
        
        // Return the result as a string
        return resultNum + " " + resultDen;
    }
    
    // Helper method to compute the greatest common divisor using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3, d = 4;

        System.out.println("Sum of fractions: " + L14AddTwoFractions.addFractions(a, b, c, d));
    }
}

package DSA_GFG.L01Mathematics;

import java.math.BigInteger ;
public class L18Combinations {



        // Method to compute factorial of a number
        public static BigInteger factorial(int n) {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }

        // Method to compute nCr
        public static BigInteger nCr(int n, int r) {
            if (r > n) {
                throw new IllegalArgumentException("r must be less than or equal to n");
            }
            return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
        }

        public static void main(String[] args) {
            int n = 5;
            int r = 3;
            System.out.println("nCr of " + n + " and " + r + " is: " + nCr(n, r));
        }
    

}

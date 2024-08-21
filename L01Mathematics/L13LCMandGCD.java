package DSA_GFG.L01Mathematics;

public class L13LCMandGCD {

    // GCD
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    // LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
// Input: a = 5 , b = 10
// Output: 10 5
// Explanation: LCM of 5 and 10 is 10, while their GCD is 5.

        int a = 5, b = 10;
        System.out.println("LCM of " + a + " and " + b + " is: " + L13LCMandGCD.lcm(a, b));

        System.out.println("GCD of " + a + " and " + b + " is: " + L13LCMandGCD.gcd(a, b));
    }

}

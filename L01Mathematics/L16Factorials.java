package DSA_GFG.L01Mathematics;

import java.util.Scanner;
public class L16Factorials {

    // Method to compute factorial of a number
    public static long factorial(int n) {
        if (n < 0) {
            // throw new IllegalArgumentException("Number must be non-negative");
            System.err.println("number must be positive ");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        input.close();
    }

}

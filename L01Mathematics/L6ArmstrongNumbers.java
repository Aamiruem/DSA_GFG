// package DSA_GFG.L01Mathematics;
// public class L6ArmstrongNumbers {
//     static String armstrongNumber(int n) {
//         int temp = n;
//         int numDigits = Integer.toString(n).length();  // Get the number of digits
//         int sum = 0;

//         while (temp != 0) {
//             int digit = temp % 10;  // Get the last digit
//             sum += Math.pow(digit, numDigits);  // Raise the digit to the power of numDigits and add to sum
//             temp /= 10;  // Remove the last digit
//         }

//         if (sum == n) {
//             return "Yes";  // If the sum equals the original number, it's an Armstrong number
//         } else {
//             return "No";  // Otherwise, it's not
//         }
//     }
// }









package DSA_GFG.L01Mathematics;
import java.util.Scanner;

public class L6ArmstrongNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        // Convert the number to a string to count digits
        String numStr = Integer.toString(number);
        int numDigits = numStr.length();
        int sum = 0;
        int temp = number;

        // Calculate the sum of digits raised to the power of numDigits
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == number;
    }
}

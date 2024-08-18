// Input: N = 12321
// Output: Yes
// Explanation: 12321 is a Palindrome number because after reversing its digits, the number becomes 12321 which is same as the original number.

// Input: N = 1234
// Output: No
// Explanation: 1234 is not a Palindrome number because after reversing its digits, the number becomes 4321 which is different from the original number.






package DSA_GFG.L01Mathematics;

import java.util.Scanner;
public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int originalNumber = sc.nextInt();
        int reversedNumber = 0;
        int temp = originalNumber;

        // Reverse the number
        while (temp != 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }

        // Check if the original number is the same as the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        sc.close();
    }
}

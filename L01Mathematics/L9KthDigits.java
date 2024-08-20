// package DSA_GFG.L01Mathematics;
// import java.util.Scanner;
// public class L9KthDigits {
//     public static void main(String[] args) {
//         // Create a Scanner object to read input from the console
//         Scanner scanner = new Scanner(System.in);
//         // Prompt the user to enter a number
//         System.out.print("Enter a number: ");
//         long number = scanner.nextLong();
//         // Prompt the user to enter the value of k
//         System.out.print("Enter the position of the digit to print (k): ");
//         int k = scanner.nextInt();
//         // Convert the number to a string
//         String numberStr = Long.toString(number);
//         // Check if k is within the valid range
//         if (k > 0 && k <= numberStr.length()) {
//             // Get the k-th digit as a character
//             char kthDigitChar = numberStr.charAt(k - 1); // k-1 because string index is 0-based
//             // Convert the character to an integer digit
//             int kthDigit = Character.getNumericValue(kthDigitChar);
//             // Print the k-th digit
//             System.out.println("The " + k + "-th digit is: " + kthDigit);
//         } else {
//             // Print an error message if k is out of range
//             System.out.println("Invalid position k: " + k);
//         }
//         // Close the scanner
//         scanner.close();
//     }
// }








// User function Template for Java

package DSA_GFG.L01Mathematics;

public class L9KthDigits {

    static long kthDigit(int A, int B, int K) {
        // Calculate A^B
        long result = (long) Math.pow(A, B);

        // Convert the result to a string
        String resultStr = Long.toString(result);

        // Check if K is within the valid range
        if (K > resultStr.length()) {
            return -1;  // Return -1 if K is larger than the number of digits
        }

        // Return the K-th digit from the right
        char kthChar = resultStr.charAt(resultStr.length() - K);
        return Character.getNumericValue(kthChar);
    }

    public static void main(String[] args) {
        // Test the function
        // Input:
// A = 3
// B = 3
// K = 1
// Output:
// 7
// Explanation:
// 33 = 27 and 1st
// digit from right is 
// 7
        int A = 3, B = 3, K = 7;
        System.out.println(kthDigit(A, B, K));


//         Input:
// A = 5
// B = 2
// K = 2
// Output:
// 2
// Explanation:
// 52 = 25 and second
// digit from right is
// 2.
        int A1 = 5, B1 = 2, K1 = 3;
        System.out.println(kthDigit(A1, B1, K1));
    }
}

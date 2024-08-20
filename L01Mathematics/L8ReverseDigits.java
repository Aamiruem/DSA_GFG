// package DSA_GFG.L01Mathematics;

// // Define a public class named L8ReverseDigits
// public class L8ReverseDigits {

//     // The main method is the entry point of the Java program
//     public static void main(String[] args) {
        
//         // Initialize an integer variable 'n' with the value 12345
//         int n = 12345;
        
//         // Initialize an integer variable 'rev' with the value 0, 
//         // which will hold the reversed number
//         int rev = 0;
        
//         // Start a while loop that runs as long as 'n' is not equal to 0
//         while(n != 0) {
            
//             // Calculate the remainder when 'n' is divided by 10, 
//             // which gives the last digit of 'n', and store it in 'rem'
//             int rem = n % 10;
            
//             // Multiply 'rev' by 10 to shift its digits to the left, 
//             // and add 'rem' to 'rev' to append the last digit of 'n'
//             rev = rev * 10 + rem;
            
//             // Divide 'n' by 10 to remove the last digit from 'n'
//             n = n / 10;
//         }
        
//         // Print the reversed number 'rev' to the console
//         System.out.println(rev);
//     }
// }















package DSA_GFG.L01Mathematics;

import java.util.Scanner;  // Import the Scanner class for user input

// Define a public class named L8ReverseDigits
public class L8ReverseDigits {

    // The main method is the entry point of the Java program
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer to reverse: ");
        
        // Read the integer input from the user
        int n = scanner.nextInt();
        
        // Initialize an integer variable 'rev' with the value 0, 
        // which will hold the reversed number
        int rev = 0;
        
        // Start a while loop that runs as long as 'n' is not equal to 0
        while(n != 0) {
            
            // Calculate the remainder when 'n' is divided by 10, 
            // which gives the last digit of 'n', and store it in 'rem'
            int rem = n % 10;
            
            // Multiply 'rev' by 10 to shift its digits to the left, 
            // and add 'rem' to 'rev' to append the last digit of 'n'
            rev = rev * 10 + rem;
            
            // Divide 'n' by 10 to remove the last digit from 'n'
            n = n / 10;
        }
        
        // Print the reversed number 'rev' to the console
        System.out.println("Reversed number: " + rev);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

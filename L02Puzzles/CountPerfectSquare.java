// package DSA_GFG.L02Puzzles;

// import java.util.Scanner;

// public class PerfectSquareCounter {
//     public static void main(String[] args) {
//         // Input N from the user
//         try (Scanner scanner = new Scanner(System.in)) {
//             // Input N from the user
//             System.out.print("Enter a number (N): ");
//             int N = scanner.nextInt();
            
//             // Initialize the counter for perfect squares
//             int count = 0;
            
//             // Loop to count how many perfect squares are less than or equal to N
//             for (int i = 1; i * i <= N; i++) {
//                 count++;
//             }
            
//             // Output the result
//             System.out.println("Number of perfect squares less than or equal to " + N + " is: " + count);
//         }
//     }
// }





package DSA_GFG.L02Puzzles;

import java.util.Scanner;

public class CountPerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N from the user
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        // Initialize the counter for perfect squares
        int count = 0;

        // Loop to count how many perfect squares are less than N
        for (int i = 1; i * i < N; i++) {
            count++;
        }

        // Output the result
        System.out.println("Number of perfect squares less than " + N + " is: " + count);

        scanner.close();
    }
}

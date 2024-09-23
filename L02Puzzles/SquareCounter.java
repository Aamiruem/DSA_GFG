package DSA_GFG.L02Puzzles;

import java.util.Scanner;

public class SquareCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            
            System.out.println("The squares of numbers from 1 to " + n + " are:");
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " squared is " + (i * i));
            }
        }
    }
}

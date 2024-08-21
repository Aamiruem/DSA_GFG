// Input:
// X = 10
// Output:
// 10
// Explanation:
// 10 is the largest Jumping Number
// possible for X = 10.
package DSA_GFG.L01Mathematics;

import java.util.LinkedList;
import java.util.Queue;

public class L11JumpingNumber {

    // Method to return the largest Jumping Number <= X
    public static int largestJumpingNumber(int X) {
        if (X < 10) {
            return X;
        }

        int largestJumpingNumber = 0;
        Queue<Integer> queue = new LinkedList<>();

        // Start with all single-digit numbers
        for (int i = 1; i <= 9; i++) {
            queue.add(i);
        }

        // BFS approach to find Jumping Numbers
        while (!queue.isEmpty()) {
            int num = queue.poll();

            // Update largest Jumping Number if it's less than or equal to X
            if (num <= X) {
                largestJumpingNumber = Math.max(largestJumpingNumber, num);

                int lastDigit = num % 10;

                // Generate next possible Jumping Numbers
                if (lastDigit > 0) {
                    int nextNum = num * 10 + (lastDigit - 1);
                    if (nextNum <= X) {
                        queue.add(nextNum);
                    }
                }

                if (lastDigit < 9) {
                    int nextNum = num * 10 + (lastDigit + 1);
                    if (nextNum <= X) {
                        queue.add(nextNum);
                    }
                }
            }
        }

        return largestJumpingNumber;
    }

    public static void main(String[] args) {
        int X = 10;
        System.out.println("Largest Jumping Number <= " + X + " is: " + largestJumpingNumber(X));
    }
}

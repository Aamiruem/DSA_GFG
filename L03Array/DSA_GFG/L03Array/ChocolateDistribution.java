// Input:N=8,M=5 A={3,4,1,9,56,7,9,12}
// Output:6 
// Explanation:The minimum difference between maximum chocolates and minimum chocolates is 9-3=6 by choosing following M packets:{3,4,9,7,9}.Example 2:

// Input:N=7,M=3 A={7,3,2,4,9,12,56}
// Output:2 
// Explanation:The minimum difference between maximum chocolates and minimum chocolates is 4-2=2 by choosing following M packets:{3,2,4}.

// Expected Time Complexity:O(N*Log(N))
// Expected Auxiliary Space:O(1)

package DSA_GFG.L03Array;

import java.util.Arrays;

public class ChocolateDistribution {
    public static int findMinDiff(int[] A, int N, int M) {
        if (M == 0 || N == 0) {
            return 0; // No students or no packets
        }

        // If there are fewer packets than students, it's not possible to distribute
        if (N < M) {
            return -1;
        }

        // Sort the array
        Arrays.sort(A);

        // Initialize the minimum difference as a large number
        int minDiff = Integer.MAX_VALUE;

        // Find the minimum difference between the max and min of every subarray of size
        // M
        for (int i = 0; i + M - 1 < N; i++) {
            int diff = A[i + M - 1] - A[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] A1 = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int N1 = 8;
        int M1 = 5;
        System.out.println(findMinDiff(A1, N1, M1)); // Output: 6

        int[] A2 = { 7, 3, 2, 4, 9, 12, 56 };
        int N2 = 7;
        int M2 = 3;
        System.out.println(findMinDiff(A2, N2, M2)); // Output: 2
    }
}

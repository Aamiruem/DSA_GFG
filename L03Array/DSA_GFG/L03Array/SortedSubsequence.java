// Examples:

// Input:arr=[1,2,1,1,3]Output:1 Explanation:A subsequence 1 2 3 exist.Input:arr=[1,1,3]Output:0 Explanation:No such Subsequence exist,so empty array is returned(the driver code automatically prints 0 in this case).
// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(n)


package DSA_GFG.L03Array;

import java.util.Arrays;

public class SortedSubsequence {

    public static int[] find3Numbers(int[] arr, int n) {
        if (n < 3) {
            return new int[0]; // No subsequence possible if size < 3
        }

        // Arrays to store left minimum and right maximum values
        int[] left_min = new int[n];
        int[] right_max = new int[n];

        // Fill the left_min array
        left_min[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left_min[i] = Math.min(left_min[i - 1], arr[i]);
        }

        // Fill the right_max array
        right_max[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], arr[i]);
        }

        // Now find the subsequence where arr[i] < arr[j] < arr[k]
        for (int j = 1; j < n - 1; j++) {
            if (arr[j] > left_min[j] && arr[j] < right_max[j]) {
                return new int[] { left_min[j], arr[j], right_max[j] };
            }
        }

        // If no such subsequence is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = { 1, 2, 1, 1, 3 };
        int[] result1 = find3Numbers(arr1, arr1.length);
        if (result1.length == 0) {
            System.out.println(0); // No subsequence found
        } else {
            System.out.println(1); // Subsequence found
            System.out.println(Arrays.toString(result1)); // Print subsequence [1, 2, 3]
        }

        // Example 2
        int[] arr2 = { 1, 1, 3 };
        int[] result2 = find3Numbers(arr2, arr2.length);
        if (result2.length == 0) {
            System.out.println(0); // No subsequence found
        } else {
            System.out.println(1); // Subsequence found
            System.out.println(Arrays.toString(result2)); // Print subsequence
        }
    }
}

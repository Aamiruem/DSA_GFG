// Examples:

// Input:n=3 a[]={1,2,3}Output:1 2 3 
// Explanation:In the given array every element is non-negative.Input:n=2 a[]={-1,2}Output:2 Explanation:The only subarray[2]is the answer.

// Expected Time Complexity:O(N)
// Expected Auxiliary Space:O(1)


package DSA_GFG.L03Array;

import java.util.ArrayList;

public class MaximumSubarray {

    public static ArrayList<Integer> findMaxSubarray(int[] arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();

        // Variables to track the maximum subarray
        long max_sum = -1;
        int max_start = -1, max_end = -1;

        // Variables to track the current subarray
        long current_sum = 0;
        int current_start = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                // If the element is non-negative, add it to the current subarray
                current_sum += arr[i];
            } else {
                // If the element is negative, check if the current subarray is better
                if (current_sum > max_sum || (current_sum == max_sum && (i - current_start > max_end - max_start))) {
                    max_sum = current_sum;
                    max_start = current_start;
                    max_end = i - 1;
                }
                // Reset the current subarray
                current_sum = 0;
                current_start = i + 1;
            }
        }

        // After the loop, check the last subarray
        if (current_sum > max_sum || (current_sum == max_sum && (n - current_start > max_end - max_start))) {
            max_sum = current_sum;
            max_start = current_start;
            max_end = n - 1;
        }

        // If no valid subarray is found, return -1
        if (max_start == -1) {
            result.add(-1);
        } else {
            // Add the maximum subarray elements to the result
            for (int i = max_start; i <= max_end; i++) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = { 1, 2, 5, -7, 2, 3 };
        ArrayList<Integer> result1 = findMaxSubarray(arr1, arr1.length);
        System.out.println(result1); // Output: [1, 2, 5]

        // Example 2
        int[] arr2 = { -1, 2 };
        ArrayList<Integer> result2 = findMaxSubarray(arr2, arr2.length);
        System.out.println(result2); // Output: [2]
    }
}

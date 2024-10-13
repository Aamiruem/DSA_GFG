// Examples:

// Input:arr[]=[1,10]Output:1 
// Explanation:arr[0]<arr[1]so(j-i)is 1-0=1. Input:arr[]=[34,8,10,3,2,80,30,33,1]Output:6 Explanation:In the given array arr[1]<arr[7]satisfying the required condition(arr[i]<arr[j])thus giving the maximum difference of j-i which is 6(7-1).

// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(n)


package DSA_GFG.L03Array;

public class MaximumIndexDifference {

    public static int maxIndexDiff(int[] arr, int n) {
        // Step 1: Create left_min and right_max arrays
        int[] left_min = new int[n];
        int[] right_max = new int[n];

        // Fill left_min[] such that left_min[i] is the minimum value from 0 to i
        left_min[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left_min[i] = Math.min(arr[i], left_min[i - 1]);
        }

        // Fill right_max[] such that right_max[j] is the maximum value from j to n-1
        right_max[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            right_max[j] = Math.max(arr[j], right_max[j + 1]);
        }

        // Step 2: Traverse left_min[] and right_max[] using two pointers
        int i = 0, j = 0, maxDiff = -1;
        while (i < n && j < n) {
            if (left_min[i] <= right_max[j]) {
                // If arr[i] <= arr[j], update maxDiff
                maxDiff = Math.max(maxDiff, j - i);
                j++; // Move the right pointer
            } else {
                i++; // Move the left pointer
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = { 1, 10 };
        System.out.println(maxIndexDiff(arr1, arr1.length)); // Output: 1

        // Example 2
        int[] arr2 = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
        System.out.println(maxIndexDiff(arr2, arr2.length)); // Output: 6
    }
}

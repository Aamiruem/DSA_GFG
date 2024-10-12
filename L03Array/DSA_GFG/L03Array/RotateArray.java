// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)



package DSA_GFG.L03Array;

import java.util.Arrays;

public class RotateArray {

    // Function to rotate the array by d steps to the left
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;

        // Normalize d in case d is greater than n
        d = d % n;

        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining n - d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int d1 = 2;
        rotateArray(arr1, d1);
        System.out.println(Arrays.toString(arr1)); // Output: [3, 4, 5, 1, 2]

        int[] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int d2 = 3;
        rotateArray(arr2, d2);
        System.out.println(Arrays.toString(arr2)); // Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]

        int[] arr3 = { 7, 3, 9, 1 };
        int d3 = 9;
        rotateArray(arr3, d3);
        System.out.println(Arrays.toString(arr3)); // Output: [3, 9, 1, 7]
    }
}

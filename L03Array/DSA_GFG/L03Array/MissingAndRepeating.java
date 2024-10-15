// Input:arr[]=[2,2]Output:2 1 
// Explanation:Repeating number is 2 and smallest positive missing number is 1. Input:arr[]=[1,3,3]Output:3 2 Explanation:Repeating number is 3 and smallest positive missing number is 2. 
// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(1)




package DSA_GFG.L03Array;

import java.util.Arrays;

public class MissingAndRepeating {
    public static int[] findMissingAndRepeating(int[] arr, int n) {
        int[] result = new int[2]; // result[0] will be repeating, result[1] will be missing

        // Traverse the array to find the repeating element
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);

            // If the value at index absValue - 1 is already negative, it's the repeating
            // number
            if (arr[absValue - 1] < 0) {
                result[0] = absValue; // Repeating number
            } else {
                // Otherwise, mark it as visited by negating the value
                arr[absValue - 1] = -arr[absValue - 1];
            }
        }

        // Traverse the array again to find the missing number
        for (int i = 0; i < n; i++) {
            // The index with a positive value corresponds to the missing number
            if (arr[i] > 0) {
                result[1] = i + 1; // Missing number
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 2 };
        int n1 = arr1.length;
        System.out.println(Arrays.toString(findMissingAndRepeating(arr1, n1))); // Output: [2, 1]

        int[] arr2 = { 1, 3, 3 };
        int n2 = arr2.length;
        System.out.println(Arrays.toString(findMissingAndRepeating(arr2, n2))); // Output: [3, 2]
    }
}

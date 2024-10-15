// Examples:

// Input:n=4,arr[]=[0,3,1,2]Output:-1 
// Explanation:There is no repeating element in the array.Therefore output is-1. Input:n=5,arr[]=[2,3,1,2,3]Output:2 3 Explanation:2 and 3 occur more than once in the given array.

// Expected Time Complexity:O(n).
// Expected Auxiliary Space:O(n).




package DSA_GFG.L03Array;

import java.util.*;

public class ArrayDuplicates {
    public static List<Integer> findDuplicates(int[] arr, int n) {
        // List to store the result
        List<Integer> result = new ArrayList<>();

        // Frequency array to store the count of each element
        int[] freq = new int[n];

        // Populate the frequency array
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Find all elements that have frequency greater than 1
        for (int i = 0; i < n; i++) {
            if (freq[i] > 1) {
                result.add(i);
            }
        }

        // If no duplicates were found, return [-1]
        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 0, 3, 1, 2 };
        int n1 = arr1.length;
        System.out.println(findDuplicates(arr1, n1)); // Output: [-1]

        int[] arr2 = { 2, 3, 1, 2, 3 };
        int n2 = arr2.length;
        System.out.println(findDuplicates(arr2, n2)); // Output: [2, 3]
    }
}

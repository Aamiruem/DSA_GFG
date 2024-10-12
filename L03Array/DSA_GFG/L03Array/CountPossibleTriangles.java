package DSA_GFG.L03Array;

import java.util.Arrays;

public class CountPossibleTriangles {

    // Function to count the number of possible triangles
    public static int findNumberOfTriangles(int[] arr, int n) {
        // Sort the array to simplify the triangle inequality condition
        Arrays.sort(arr);
        int count = 0;

        // Fix the largest element one by one, starting from the end of the array
        for (int k = n - 1; k >= 2; k++) {
            int i = 0; // Start pointer for the smallest element
            int j = k - 1; // End pointer for the second largest element

            // Use two-pointer technique to find valid pairs for a triangle
            while (i < j) {
                // If sum of arr[i] and arr[j] is greater than arr[k], we found a valid triangle
                if (arr[i] + arr[j] > arr[k]) {
                    // All elements between i and j can form a triangle with arr[k]
                    count += (j - i);

                    // Move the j pointer leftward to check other possible triangles
                    j--;
                } else {
                    // If sum is not greater, move the i pointer rightward to increase the sum
                    i++;
                }
            }
        }

        // Return the total number of triangles found
        return count;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = { 3, 5, 4 };
        int n1 = arr1.length;
        System.out.println("Number of triangles: " + findNumberOfTriangles(arr1, n1)); // Output: 1

        // Test case 2
        int[] arr2 = { 6, 4, 9, 7, 8 };
        int n2 = arr2.length;
        System.out.println("Number of triangles: " + findNumberOfTriangles(arr2, n2)); // Output: 10
    }
}

// Input: 
// n = 5
// array[] = {1, 2, 3, 3, 4}
// [a, b] = [1, 2]
// Output: 
// 1
// Explanation: 
// One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be 1.
// Example 2:

// Input: 
// n = 6 
// array[] = {1, 4, 3, 6, 2, 1}
// [a, b] = [1, 3]
// Output: 
// 1
// Explanation: 
// One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be 1.


// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)




package DSA_GFG.L03Array;

public class ThreeWayPartitioning {
    public static void threeWayPartition(int[] arr, int a, int b) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < a) {
                // Move arr[mid] to the "low" region
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] > b) {
                // Move arr[mid] to the "high" region
                swap(arr, mid, high);
                high--;
            } else {
                // The element is in the range [a, b]
                mid++;
            }
        }
    }

    // Helper method to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 3, 4 };
        int a1 = 1, b1 = 2;
        threeWayPartition(arr1, a1, b1);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 1 2 3 3 4

        int[] arr2 = { 1, 4, 3, 6, 2, 1 };
        int a2 = 1, b2 = 3;
        threeWayPartition(arr2, a2, b2);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        // Output: 1 3 2 1 4 6
    }
}

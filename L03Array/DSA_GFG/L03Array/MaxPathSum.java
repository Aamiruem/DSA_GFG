// Input: arr1 = [2, 3, 7, 10, 12] , arr2 = [1, 5, 7, 8]
// Output: 35
// Explanation: The path will be 1+5+7+10+12 = 35, where 1 and 5 come from arr2 and then 7 is common so we switch to arr1 and add 10 and 12.
// Input: arr1 = [1, 2, 3] , arr2[] = [3, 4, 5]
// Output: 15
// Explanation: The path will be 1+2+3+4+5=15.

// Expected Time Complexity: O(m + n)
// Expected Auxiliary Space: O(1)






package DSA_GFG.L03Array;

public class MaxPathSum {
    public static int maxPathSum(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int result = 0;
        int m = arr1.length;
        int n = arr2.length;

        // Traverse both arrays
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j];
                j++;
            } else { // arr1[i] == arr2[j]
                // Add the maximum of sum1 and sum2, and the common element
                result += Math.max(sum1, sum2) + arr1[i];
                // Reset sums
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < m) {
            sum1 += arr1[i];
            i++;
        }

        // Add remaining elements from arr2
        while (j < n) {
            sum2 += arr2[j];
            j++;
        }

        // Add the maximum of the remaining sums
        result += Math.max(sum1, sum2);

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 7, 10, 12 };
        int[] arr2 = { 1, 5, 7, 8 };
        System.out.println(maxPathSum(arr1, arr2)); // Output: 35

        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = { 3, 4, 5 };
        System.out.println(maxPathSum(arr3, arr4)); // Output: 15
    }
}

// Examples:

// Input:k=8,arr[]=[1,2,3,4,5,6,7]Output:3 
// Explanation:There are 3 pairs which sum up to 8:{1,7},{2,6},{3,5}Input:k=98,arr[]=[1,2,3,4,5,6,7]Output:0 Explanation:There are no pairs which sum up to 98. 
// Expected Time Complexity:O(n).
// Expected Auxiliary Space:O(1).






package DSA_GFG.L03Array;

public class PairWithGivenSum {
    public static int countPairsWithSum(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == k) {
                count++; // A valid pair found
                left++; // Move both pointers to avoid duplicates
                right--;
            } else if (sum < k) {
                left++; // Increase sum by moving left pointer
            } else {
                right--; // Decrease sum by moving right pointer
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int k1 = 8;
        System.out.println(countPairsWithSum(arr1, k1)); // Output: 3

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
        int k2 = 98;
        System.out.println(countPairsWithSum(arr2, k2)); // Output: 0
    }
}

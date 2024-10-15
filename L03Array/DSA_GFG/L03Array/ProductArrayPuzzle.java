// Examples:

// Input:nums[]=[10,3,5,6,2]Output:[180,600,360,300,900]
// Explanation:For i=0,P[i]=3*5*6*2=180. For i=1,P[i]=10*5*6*2=600. For i=2,P[i]=10*3*6*2=360. For i=3,P[i]=10*3*5*2=300. For i=4,P[i]=10*3*5*6=900. Input:nums[]=[12,0]Output:[0,12]
// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(n)



package DSA_GFG.L03Array;

import java.util.Arrays;

public class ProductArrayPuzzle {
    public static int[] productArray(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        // Initialize the first element of left and last element of right
        left[0] = 1;
        right[n - 1] = 1;

        // Construct left array where left[i] contains the product of all elements to
        // the left of nums[i]
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Construct right array where right[i] contains the product of all elements to
        // the right of nums[i]
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Construct the result array by multiplying left[i] and right[i]
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 10, 3, 5, 6, 2 };
        System.out.println(Arrays.toString(productArray(nums1))); // Output: [180, 600, 360, 300, 900]

        int[] nums2 = { 12, 0 };
        System.out.println(Arrays.toString(productArray(nums2))); // Output: [0, 12]
    }
}

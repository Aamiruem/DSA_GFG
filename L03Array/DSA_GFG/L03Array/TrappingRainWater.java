// Input:arr[]=[7,4,0,9]Output:10 
// Explanation:Water trapped by above block of height 4 is 3 units and above block of height 0 is 7 units.So,the total unit of water trapped is 10 units.Input:arr[]=[6,9,9]Output:0 Explanation:No water will be trapped.
// Expected Time Complexity:O(N)
// Expected Auxiliary Space:O(N)



package DSA_GFG.L03Array;

public class TrappingRainWater {
    // Function to calculate the trapped water
    public static int trap(int[] height) {
        int n = height.length;
        if (n <= 2)
            return 0; // No water can be trapped if there are less than 3 blocks

        // Create arrays to store the left max and right max heights
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill the leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Fill the rightMax array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate the total water trapped
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 0, 0, 2, 0, 4 };
        System.out.println(trap(arr1)); // Output: 10

        int[] arr2 = { 7, 4, 0, 9 };
        System.out.println(trap(arr2)); // Output: 10

        int[] arr3 = { 6, 9, 9 };
        System.out.println(trap(arr3)); // Output: 0
    }
}

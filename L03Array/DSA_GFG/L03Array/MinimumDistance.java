// Input:N=4 A[]={1,2,3,2}x=1,y=2 Output:1

//  Explanation:x=1 and y=2. There are two distances between x and y,which are 1 and 3 out of which the least is 1. 

// Example 2:
// Input:N=7 A[]={86,39,90,67,84,66,62}x=42,y=12 Output:-1 

// Explanation:x=42 and y=12. We return-1 as x and y don't exist in the array.Your Task:Complete the function minDist()which takes the array a,and 3 integers n,x and y as input parameters and returns the minimum distance between x and y in the array.Return-1,if either x or y does not exist in the array.

// Expected Time Complexity:O(N)
// Expected Auxiliary Space:O(1)


package DSA_GFG.L03Array;

public class MinimumDistance {

    public static int minDist(int[] arr, int n, int x, int y) {
        int last_x = -1, last_y = -1; // To track the indices of x and y
        int minDistance = Integer.MAX_VALUE; // Initialize with a large value

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Update last seen index of x
            if (arr[i] == x) {
                last_x = i;
            }

            // Update last seen index of y
            if (arr[i] == y) {
                last_y = i;
            }

            // If both x and y have been seen, calculate the distance
            if (last_x != -1 && last_y != -1) {
                int distance = Math.abs(last_x - last_y);
                minDistance = Math.min(minDistance, distance);
            }
        }

        // If either x or y was never found, return -1
        if (last_x == -1 || last_y == -1) {
            return -1;
        }

        return minDistance;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = { 1, 2, 3, 2 };
        int x1 = 1, y1 = 2;
        int result1 = minDist(arr1, arr1.length, x1, y1);
        System.out.println(result1); // Output: 1

        // Example 2
        int[] arr2 = { 86, 39, 90, 67, 84, 66, 62 };
        int x2 = 42, y2 = 12;
        int result2 = minDist(arr2, arr2.length, x2, y2);
        System.out.println(result2); // Output: -1
    }
}

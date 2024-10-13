// Input: n = 6, arr[] = {16,17,4,3,5,2}
// Output: 17 5 2
// Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
// Input: n = 5, arr[] = {10,4,2,4,1}
// Output: 10 4 4 1
// Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side
// Input: n = 4, arr[] = {5, 10, 20, 40} 
// Output: 40
// Explanation: When an array is sorted in increasing order, only the rightmost element is leader.
// Input: n = 4, arr[] = {30, 10, 10, 5} 
// Output: 30 10 10 5
// Explanation: When an array is sorted in non-increasing order, all elements are leaders.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)



package DSA_GFG.L03Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    public static void findLeaders(int[] arr, int n) {
        // Create an ArrayList to store the leaders
        ArrayList<Integer> leaders = new ArrayList<>();

        // The rightmost element is always a leader
        int max_from_right = arr[n - 1];
        leaders.add(max_from_right);

        // Traverse the array from second last element to the first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max_from_right) {
                leaders.add(arr[i]);
                max_from_right = arr[i];
            }
        }

        // Reverse the list to maintain the original order of leaders
        Collections.reverse(leaders);

        // Print the result as space-separated leaders
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = { 16, 17, 4, 3, 5, 2 };
        int n1 = arr1.length;
        findLeaders(arr1, n1); // Output: 17 5 2
        System.out.println();

        // Test Case 2
        int[] arr2 = { 10, 4, 2, 4, 1 };
        int n2 = arr2.length;
        findLeaders(arr2, n2); // Output: 10 4 4 1
        System.out.println();
    }
}

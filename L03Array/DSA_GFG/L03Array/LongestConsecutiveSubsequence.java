// Input:N=7 a[]={2,6,1,9,4,5,3}Output:6 Explanation:The consecutive numbers here are 1,2,3,4,5,6. These 6 numbers form the longest consecutive subsequence.Example 2:

// Input:N=7 a[]={1,9,3,10,4,20,2}Output:4 Explanation:1,2,3,4 is the longest consecutive subsequence.


// Expected Time Complexity:O(R),where R is the maximum integer in the array.
// Expected Auxiliary Space:O(N).



package DSA_GFG.L03Array;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static int findLongestConseqSubseq(int[] arr, int N) {
        HashSet<Integer> numSet = new HashSet<>();

        // Step 1: Insert all elements into the HashSet for O(1) lookups
        for (int num : arr) {
            numSet.add(num);
        }

        int longestSequenceLength = 0;

        // Step 2: Iterate through the array
        for (int num : arr) {
            // Check if num is the start of a potential sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequenceLength = 1;

                // Count consecutive elements
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequenceLength++;
                }

                // Update longest sequence length if necessary
                longestSequenceLength = Math.max(longestSequenceLength, currentSequenceLength);
            }
        }

        return longestSequenceLength;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 6, 1, 9, 4, 5, 3 };
        int N1 = 7;
        System.out.println(findLongestConseqSubseq(arr1, N1)); // Output: 6

        int[] arr2 = { 1, 9, 3, 10, 4, 20, 2 };
        int N2 = 7;
        System.out.println(findLongestConseqSubseq(arr2, N2)); // Output: 4
    }
}

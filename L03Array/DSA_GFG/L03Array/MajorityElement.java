// Examples:

// Input:arr[]=[3,1,3,3,2]Output:3 
// Explanation:Since,3 is present more than n/2 times,so it is the majority element.Input:arr[]=[7]Output:7 Explanation:Since,7 is single element and present more than n/2 times,so it is the majority element.Input:arr[]=[2,13]Output:-1 Explanation:Since,no element is present more than n/2 times,so there is no majority element.
// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(1)



package DSA_GFG.L03Array;

public class MajorityElement {

    public static int findMajorityElement(int[] arr, int n) {
        // Step 1: Find a candidate
        int candidate = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i]; // Set new candidate
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify if the candidate is indeed the majority element
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = { 3, 1, 3, 3, 2 };
        System.out.println(findMajorityElement(arr1, arr1.length)); // Output: 3

        // Example 2
        int[] arr2 = { 7 };
        System.out.println(findMajorityElement(arr2, arr2.length)); // Output: 7

        // Example 3
        int[] arr3 = { 2, 13 };
        System.out.println(findMajorityElement(arr3, arr3.length)); // Output: -1
    }
}

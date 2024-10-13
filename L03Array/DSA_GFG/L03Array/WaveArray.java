// Examples:

// Input:n=5,arr[]={1,2,3,4,5}Output:2 1 4 3 5 Explanation:Array elements after sorting it in the waveform are 2 1 4 3 5. Input:n=6,arr[]={2,4,7,8,9,10}Output:4 2 8 7 10 9 Explanation:Array elements after sorting it in the waveform are 4 2 8 7 10 9. 
// Expected Time Complexity:O(n).
// Expected Auxiliary Space:O(1).


package DSA_GFG.L03Array;

public class WaveArray {
    // Function to sort array into wave form
    public static void convertToWave(int[] arr, int n) {
        // Traverse the array, swap adjacent elements
        for (int i = 0; i < n - 1; i += 2) {
            // Swap arr[i] and arr[i+1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = { 1, 2, 3, 4, 5 };
        convertToWave(arr1, arr1.length);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        // Output: 2 1 4 3 5

        System.out.println();

        // Example 2
        int[] arr2 = { 2, 4, 7, 8, 9, 10 };
        convertToWave(arr2, arr2.length);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        // Output: 4 2 8 7 10 9
    }
}

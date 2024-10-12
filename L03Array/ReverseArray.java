// Expected Time Complexity:O(n)
// Expected Space Complexity:O(1)


package DSA_GFG.L03Array;

public class ReverseArray {

    // Method to reverse the array in-place
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Swap elements from the start and the end, moving towards the center
        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }

    // Method to print the array (for testing purposes)
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Test the method with sample inputs
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = { 1, 2, 3, 4 };
        reverseArray(arr1);
        printArray(arr1); // Output: 4 3 2 1

        // Test case 2
        int[] arr2 = { 1 };
        reverseArray(arr2);
        printArray(arr2); // Output: 1
    }
}

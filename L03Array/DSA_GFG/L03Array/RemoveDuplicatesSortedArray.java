// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(1)


package DSA_GFG.L03Array;

public class RemoveDuplicatesSortedArray {

    // Function to remove duplicates from a sorted array
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0)
            return 0;

        // Initialize the two pointers
        int i = 1; // Index for unique elements

        // Traverse the array
        for (int j = 1; j < arr.length; j++) {
            // If current element is not equal to the previous, it's a new unique element
            if (arr[j] != arr[j - 1]) {
                arr[i] = arr[j];
                i++; // Move the index for unique elements
            }
        }

        // i now holds the size of the modified array with distinct elements
        return i;
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr1 = { 2, 2, 2, 2, 2 };
        int newSize1 = removeDuplicates(arr1);
        System.out.println("New size: " + newSize1); // Output: 1
        for (int i = 0; i < newSize1; i++) {
            System.out.print(arr1[i] + " "); // Output: 2
        }
        System.out.println();

        int[] arr2 = { 1, 2, 4 };
        int newSize2 = removeDuplicates(arr2);
        System.out.println("New size: " + newSize2); // Output: 3
        for (int i = 0; i < newSize2; i++) {
            System.out.print(arr2[i] + " "); // Output: 1 2 4
        }
        System.out.println();
    }
}

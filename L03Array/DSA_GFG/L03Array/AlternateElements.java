package DSA_GFG.L03Array;

public class AlternateElements {

    // Method to print alternate elements starting from index 0
    public static void printAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    // Test the method with sample inputs
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = { 1, 2, 3, 4 };
        printAlternateElements(arr1); // Output: 1 3

        System.out.println();

        // Test case 2
        int[] arr2 = { 1, 2, 3, 4, 5 };
        printAlternateElements(arr2); // Output: 1 3 5
    }
}

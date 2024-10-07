package DSA_GFG.L03Array;

public class MinMaxArray {

    // Method to find the minimum and maximum elements in the array
    public static int[] findMinMax(int[] arr) {
        // Initialize min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Traverse the array to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return an array with min and max
        return new int[] { min, max };
    }

    // Test the method with sample inputs
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = { 3, 2, 1, 56, 10000, 167 };
        int[] result1 = findMinMax(arr1);
        System.out.println(result1[0] + " " + result1[1]); // Output: 1 10000

        // Test case 2
        int[] arr2 = { 1, 345, 234, 21, 56789 };
        int[] result2 = findMinMax(arr2);
        System.out.println(result2[0] + " " + result2[1]); // Output: 1 56789

        // Test case 3
        int[] arr3 = { 56789 };
        int[] result3 = findMinMax(arr3);
        System.out.println(result3[0] + " " + result3[1]); // Output: 56789 56789
    }
}

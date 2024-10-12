



// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(1)



package DSA_GFG.L03Array;

public class ArraySum {

    // Method to find the sum of elements in the array
    public static int findSum(int[] arr) {
        int sum = 0;

        // Traverse the array and add each element to the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // Test the method with sample inputs
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = { 1, 2, 3, 4 };
        System.out.println(findSum(arr1)); // Output: 10

        // Test case 2
        int[] arr2 = { 1, 3, 3 };
        System.out.println(findSum(arr2)); // Output: 7
    }
}

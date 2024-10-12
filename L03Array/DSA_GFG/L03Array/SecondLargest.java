// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(1)



package DSA_GFG.L03Array;

public class SecondLargest {

    // Method to find the second largest distinct element
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Traverse the array to find the first and second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        // If second is still MIN_VALUE, that means there was no second largest distinct
        // element
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    // Test the method with sample inputs
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = { 12, 35, 1, 10, 34, 1 };
        System.out.println(findSecondLargest(arr1)); // Output: 34

        // Test case 2
        int[] arr2 = { 10, 10 };
        System.out.println(findSecondLargest(arr2)); // Output: -1

        // Test case 3
        int[] arr3 = { 1, 2, 3, 4, 5 };
        System.out.println(findSecondLargest(arr3)); // Output: 4

        // Test case 4
        int[] arr4 = { 100 };
        System.out.println(findSecondLargest(arr4)); // Output: -1
    }
}

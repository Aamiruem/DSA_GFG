// Expected Time Complexity:O(n)
// Expected Auxiliary Space:O(1)

package DSA_GFG.L03Array;

public class CountOfSmallerElements {

    // Function to count elements less than or equal to x
    public static int countOfElements(int[] arr, int x) {
        int count = 0;

        // Traverse the array and count elements <= x
        for (int num : arr) {
            if (num <= x) {
                count++;
            }
        }

        return count;
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr1 = { 10, 1, 2, 8, 4, 5 };
        int x1 = 9;
        System.out.println(countOfElements(arr1, x1)); // Output: 5

        int[] arr2 = { 1, 2, 2, 5, 7, 2, 9 };
        int x2 = 2;
        System.out.println(countOfElements(arr2, x2)); // Output: 4
    }
}

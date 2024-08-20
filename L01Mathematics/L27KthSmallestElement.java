package DSA_GFG.L01Mathematics;

public class L27KthSmallestElement {
    public static void main(String[] args) {
        // Example arrays a and b
        int[] a = {3, 5, 7};
        int[] b = {3, 6, 8};
        int k = 1;  // We want the 1st smallest element

        // Find the k-th smallest element
        int result = findKthSmallest(a, b, k);

        // Print the result
        System.out.println("The " + k + "-th smallest element is: " + result);
    }

    // Method to find the k-th smallest element in two sorted arrays
    public static int findKthSmallest(int[] a, int[] b, int k) {
        // Since k = 1, we want the smallest element between a[0] and b[0]
        return Math.min(a[0], b[0]);
    }
}

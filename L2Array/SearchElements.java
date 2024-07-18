// Time Complexity: O(N) 
// Auxiliary Space: O(1)

package DSA_GFG.L2Array;

public class SearchElements {
    public static int findElement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int key = 10;

        int result = findElement(arr, n, key);

        if (result == -1){
            System.out.println("Element not found");
        } else{
            System.out.println("Element found at index: " + result);
        }
    }
}

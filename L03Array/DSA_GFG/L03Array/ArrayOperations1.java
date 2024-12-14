package DSA_GFG.L03Array;

import java.util.*;

public class ArrayOperations1 {

    // Function to search for an element x in the array
    public static boolean searchEle(ArrayList<Integer> arr, int x) {
        return arr.contains(x);
    }

    // Function to insert an element y at index yi in the array
    public static boolean insertEle(ArrayList<Integer> arr, int y, int yi) {
        if (yi >= 0 && yi <= arr.size()) { // Check if the index is valid
            arr.add(yi, y);
            return true;
        }
        return false;
    }

    // Function to delete the first occurrence of element z in the array
    public static boolean deleteEle(ArrayList<Integer> arr, int z) {
        return arr.remove((Integer) z); // Remove by value, not index
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 1, 0, 2));
        int x = 1, y = 2, yi = 2, z = 0;

        // Search for x
        System.out.println(searchEle(arr, x)); // true

        // Insert y at index yi
        System.out.println(insertEle(arr, y, yi)); // true
        System.out.println(arr); // [2, 4, 2, 1, 0, 2]

        // Delete first occurrence of z
        System.out.println(deleteEle(arr, z)); // true
        System.out.println(arr); // [2, 4, 2, 1, 2]
    }
}

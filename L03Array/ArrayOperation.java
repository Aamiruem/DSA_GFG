package DSA_GFG.L03Array;

import java.util.ArrayList;

public class ArrayOperation {
    // Function to search for an element x in the array
    public static boolean searchEle(ArrayList<Integer> arr, int x) {
        // Loop through the array to find x
        for (int ele : arr) {
            if (ele == x) {
                return true; // x is found
            }
        }
        return false; // x is not found
    }

    // Function to insert an element y at index yi
    public static boolean insertEle(ArrayList<Integer> arr, int y, int yi) {
        if (yi >= 0 && yi < arr.size()) {
            arr.add(yi, y); // Insert y at index yi
            return true; // Insertion successful
        }
        return false; // Invalid index
    }

    // Function to delete the first occurrence of element z from the array
    public static boolean deleteEle(ArrayList<Integer> arr, int z) {
        // Find the first occurrence of z
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == z) {
                arr.remove(i); // Remove the element at index i
                return true; // Deletion successful
            }
        }
        return false; // z not found in the array
    }

    public static void main(String[] args) {
        // Example input
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.add(0);
        arr.add(2);

        int x = 1;
        int y = 2;
        int yi = 2;
        int z = 0;

        // Calling searchEle
        System.out.println(searchEle(arr, x)); // Output should be true

        // Calling insertEle
        System.out.println(insertEle(arr, y, yi)); // Output should be true

        // Calling deleteEle
        System.out.println(deleteEle(arr, z)); // Output should be true

        // Printing the modified array
        System.out.println(arr); // Expected array: [2, 4, 2, 1, 2]
    }
}

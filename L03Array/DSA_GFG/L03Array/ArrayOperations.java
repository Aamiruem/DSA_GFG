package DSA_GFG.L03Array;

import java.util.ArrayList;

public class ArrayOperations {

    // Function to search for element x in the array
    public static boolean searchEle(ArrayList<Integer> arr, int x) {
        return arr.contains(x);  // returns true if x is found, else false
    }

    // Function to insert element y at index yi in the array
    public static boolean insertEle(ArrayList<Integer> arr, int y, int yi) {
        try {
            arr.add(yi, y);  // adds y at index yi
            return true;     // always true as insertion will be successful
        } catch (IndexOutOfBoundsException e) {
            return false;    // in case the index is out of bounds (although constraints guarantee this won't happen)
        }
    }

    // Function to delete the first occurrence of element z in the array
    public static boolean deleteEle(ArrayList<Integer> arr, int z) {
        return arr.remove((Integer) z);  // removes the first occurrence of z and returns true if successful, false if not found
    }

    // Example usage
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(2); arr1.add(4); arr1.add(1); arr1.add(0); arr1.add(2);
        
        int x1 = 1, y1 = 2, yi1 = 2, z1 = 0;
        System.out.println(searchEle(arr1, x1));  // Output: true
        System.out.println(insertEle(arr1, y1, yi1));  // Output: true
        System.out.println(arr1);  // After insertion: [2, 4, 2, 1, 0, 2]
        System.out.println(deleteEle(arr1, z1));  // Output: true
        System.out.println(arr1);  // After deletion: [2, 4, 2, 1, 2]

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(17); arr2.add(15); arr2.add(8); arr2.add(9); arr2.add(12);
        
        int x2 = 10, y2 = 6, yi2 = 2, z2 = 5;
        System.out.println(searchEle(arr2, x2));  // Output: false
        System.out.println(insertEle(arr2, y2, yi2));  // Output: true
        System.out.println(arr2);  // After insertion: [17, 15, 6, 8, 9, 12]
        System.out.println(deleteEle(arr2, z2));  // Output: false
        System.out.println(arr2);  // No deletion: [17, 15, 6, 8, 9, 12]
    }
}

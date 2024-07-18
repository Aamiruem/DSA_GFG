package DSA_GFG.L2Array;

public class InsertElements {
    // Function to insert a given key in
    // the array. This function returns n+1
    // if insertion is successful, else n.
    public static int insertSorted(int arr[], int n, int key, int capacity) {
        
        // If the array is already sorted,
        // then no need to insert
        // Cannot insert more elements if n
        // is already more than or equal to
        // capacity
        if (n >= capacity) {
            System.out.println("Array is full. Cannot insert.");
            return n;

        }
        // Shift all elements by 1 position ahead
        arr[n] = key;

        // for(int i=n-1; i>=0 && arr[i]>key; i--){
        // arr[i+1] = arr[i];
        // }

        return n + 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6;
        int i, key = 26;

        System.out.print("Before Insertion: ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Inserting key
        n = insertSorted(arr, n, key, capacity);

        System.out.print("\n After Insertion: ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

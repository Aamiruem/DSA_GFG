// package DSA_GFG.L01Mathematics;
// public class L15GCDofArray {
//     // Function to find the GCD of two numbers
//     public static int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }
//     // Function to find the GCD of an array
//     public static int findGCD(int[] arr) {
//         int result = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             result = gcd(result, arr[i]);
//             // If at any point GCD becomes 1, return 1
//             if (result == 1) {
//                 return 1;
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         // int[] arr = {24, 36, 48, 60};
//         int[] arr = {2, 4, 6};
//         System.out.println("GCD of the array: " + findGCD(arr));
//     }
// }
// package DSA_GFG.L01Mathematics;
// public class L15GCDofArray {
//     // Method to compute GCD of two numbers
//     public static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
//     // Method to compute GCD of an array
//     public static int gcdOfArray(int[] arr) {
//         if (arr == null || arr.length == 0) {
//             throw new IllegalArgumentException("Array cannot be null or empty");
//         }
//         int result = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             result = gcd(result, arr[i]);
//             if (result == 1) { // Early exit if GCD is 1
//                 break;
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         int[] array = {2, 4, 6};
//         System.out.println("GCD of the array: " + gcdOfArray(array));
//     }
// }





package DSA_GFG.L01Mathematics;

public class L15GCDofArray {

    // Method to compute GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute GCD of an array
    public static int gcdOfArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 3;
        int[] arr = { 2, 4, 6 };
        System.out.println("GCD of the array: " + gcdOfArray(arr));
    }

}

package DSA_GFG.L02Puzzles;

public class overlappingRectangle {
    public static int isOverlapping(int[] L1, int[] R1, int[] L2, int[] R2) {
        int x1 = L1[0], y1 = L1[1]; // Top-left corner of rectangle 1
        int x3 = R1[0], y3 = R1[1]; // Bottom-right corner of rectangle 1
        int x2 = L2[0], y2 = L2[1]; // Top-left corner of rectangle 2
        int x4 = R2[0], y4 = R2[1]; // Bottom-right corner of rectangle 2

        // Check for non-overlapping conditions
        if (x3 < x2 || x1 > x4 || y3 > y2 || y1 < y4) {
            return 0; // The rectangles do not overlap
        }
        return 1; // The rectangles overlap
    }

    // Example Usage
    public static void main(String[] args) {
        int[] L1 = { 0, 10 };
        int[] R1 = { 10, 0 };
        int[] L2 = { 5, 5 };
        int[] R2 = { 15, 0 };
        System.out.println(isOverlapping(L1, R1, L2, R2)); // Output: 1

        int[] L3 = { 0, 2 };
        int[] R3 = { 1, 1 };
        int[] L4 = { -2, 0 };
        int[] R4 = { 0, -3 };
        System.out.println(isOverlapping(L3, R3, L4, R4)); // Output: 0
    }
}

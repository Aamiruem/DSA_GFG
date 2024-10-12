package DSA_GFG.L02Puzzles;

public class powerOfAnother {
    public static int isPowerOfAnother(int X, int Y) {
        // Special case when X is 1
        if (X == 1) {
            return (Y == 1) ? 1 : 0; // 1^n is only 1 for any n
        }

        // Special case when Y is less than 1
        if (Y < 1) {
            return 0; // No positive integer power can be less than 1
        }

        int power = 1; // X^0 = 1
        while (power < Y) {
            power *= X; // Increase power to X^n
        }

        return (power == Y) ? 1 : 0; // Check if we found the exact power
    }

    // Example Usage
    public static void main(String[] args) {
        System.out.println(isPowerOfAnother(2, 8)); // Output: 1
        System.out.println(isPowerOfAnother(1, 8)); // Output: 0
    }
}

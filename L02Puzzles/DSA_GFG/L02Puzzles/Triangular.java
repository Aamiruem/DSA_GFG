// Input:
// N=55
// Output:
// 1
// Explanation:
// 55 is a triangular number.
// It can be represented in 10 rows.





package DSA_GFG.L02Puzzles;

public class Triangular {

    public int isTriangular(int N) {
        // Calculate the discriminant
        double discriminant = 1 + 8 * (double) N;

        // Check if the discriminant is a perfect square
        double sqrtDiscriminant = Math.sqrt(discriminant);

        // If the square root of discriminant is not an integer, return 0 (not
        // triangular)
        if (sqrtDiscriminant != (int) sqrtDiscriminant) {
            return 0;
        }

        // Calculate the value of k using the quadratic formula
        int k = (int) ((-1 + sqrtDiscriminant) / 2);

        // Check if the calculated k satisfies the triangular number condition
        if (k * (k + 1) / 2 == N) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Triangular obj = new Triangular();
        int N = 55;
        int result = obj.isTriangular(N);
        System.out.println(result);
    }
}

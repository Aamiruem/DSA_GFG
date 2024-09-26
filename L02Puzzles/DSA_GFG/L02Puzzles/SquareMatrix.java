// Input:
// m = 2, n = 2
// Output:
// 5
// Explanation:
// There are a total of 5 squares in a 2*2
// matrix. Four 1*1 squares and one 2*2 square.
// Example 2:

// Input:
// m = 4, n = 3
// Output:
// 20
// Explanation:
// There are a total of 20 squares in a 4*3
// matrix. 


// Expected Time Complexity:O(1)
// Expected Auxiliary Space:O(1)




package DSA_GFG.L02Puzzles;

public class SquareMatrix {
    public int squaresInMatrix(int m, int n) {
        int totalSquares = 0;
        // We can have squares of size 1x1, 2x2, ..., min(m, n)xmin(m, n)
        int minDim = Math.min(m, n);

        // Loop over each possible square size k from 1 to min(m, n)
        for (int k = 1; k <= minDim; k++) {
            totalSquares += (m - k + 1) * (n - k + 1);
        }

        return totalSquares;
    }

    public static void main(String[] args) {
        SquareMatrix obj = new SquareMatrix();
        int m = 2;
        int n = 2;
        int result = obj.squaresInMatrix(m, n);
        System.out.println(result);
    }
}

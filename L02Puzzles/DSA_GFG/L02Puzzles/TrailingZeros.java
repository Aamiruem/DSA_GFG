package DSA_GFG.L02Puzzles;

public class TrailingZeros {
    public int trailingZeroes(int N) {
        int count = 0;

        // Keep dividing N by powers of 5 and add the quotient to count
        for (int i = 5; N / i >= 1; i *= 5) {
            count += N / i;
        }

        return count;
    }

    public static void main(String[] args) {
        TrailingZeros obj = new TrailingZeros();
        int N = 5; //120 have one zero
        // N = 4;  //24 have no zeros
        int result = obj.trailingZeroes(N);
        System.out.println(result);
    }
}

package DSA_GFG.L01Mathematics;

public class L5ClosestNumber {

    public static int closestNumber(int N, int M) {
        int div = N / M;
        int rem = N % M;

        if (rem <= M / 2) {
            return div * M;
        } else {
            return (div + 1) * M;
        }
    }

    public static void main(String[] args) {

        int N = 10;
        int M = 5;

        System.out.println(closestNumber(N, M));

        int N1 = 13;
        int M1 = 4;

        System.out.println(closestNumber(N1, M1));

    }

}

package DSA_GFG.L01Mathematics;

import java.io.*;

public class L3SeriesAP {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a1;
            a1 = Integer.parseInt(br.readLine());

            int a2;
            a2 = Integer.parseInt(br.readLine());

            int n;
            n = Integer.parseInt(br.readLine());

            L3SeriesAP obj = new L3SeriesAP();
            int res = obj.nthTermOfAP(a1, a2, n);

            System.out.println(res);
        }
    }

    // Method to find the nth term of an arithmetic progression
    public int nthTermOfAP(int a1, int a2, int n) {
        int d = a2 - a1; // common difference
        return a1 + (n - 1) * d;
    }

    // Your Code Here
    // Additional Methods or Helper Functions
}

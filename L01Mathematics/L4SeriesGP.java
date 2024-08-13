// package DSA_GFG.L01Mathematics;

// public class L4SeriesGP {
   
//     public int Nth_term(int a, int r, int n)
//     {
//         // Compute the n-th term using the formula a * r^(n-1)
//         return (int)(a * Math.pow(r, n - 1));
//     }
//     public static void main(String[] args) {

//         L4SeriesGP gp = new L4SeriesGP();

//         int a = 2;
//         int r = 3;
//         int n = 5;
//         System.out.println(gp.Nth_term(a, r, n));
//     }
// }








package DSA_GFG.L01Mathematics;
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int a = sc.nextInt();
            int r = sc.nextInt();
            int n = sc.nextInt();
            L4SeriesGP  ob = new L4SeriesGP ();
            int ans = ob.Nth_term(a, r, n);
            System.out.println(ans);
        }
    }
}

class L4SeriesGP {

    public int Nth_term(int a, int r, int n)
    {
        // Compute the n-th term using the formula a * r^(n-1)
        return (int)(a * Math.pow(r, n - 1));
    }
}

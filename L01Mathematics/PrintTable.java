package DSA_GFG.L01Mathematics;
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

public class PrintTable {

    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.getTable(N);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> table = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                table.add(calculate(N, i, j));
            }
        }
        return table;
    }
    
    static int calculate(int N, int i, int j) {
        return (int) Math.pow(i, j) % N;
    }
}

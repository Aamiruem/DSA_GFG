package DSA_GFG.L01Mathematics;

import java.io.*;
import java.util.*;

public class PrintTable {

    public static void main(String args[]) throws IOException {
        System.out.println("Enter your table number: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int N = sc.nextInt(); // the number for which the table is to be printed
            PrintTable ob = new PrintTable();
            ArrayList<Integer> ans = ob.getTable(N); // calling the getTable method
            for (Integer val : ans) 
                System.out.print(val + " "); 
            System.out.println();
        }
        sc.close();
    }

    // Method to generate the multiplication table of a given number N
    public ArrayList<Integer> getTable(int N) {
        ArrayList<Integer> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(N * i); // calculating the i-th multiple of N
        }
        return table;
    }
}
// Time Complexity : O(1)
// Space Complexity : O(1)

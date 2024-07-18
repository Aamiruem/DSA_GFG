// package DSA_GFG.L01Mathematics;

// import java.util.*;

// public class printPattern {
    
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         while(n > 0){
//             int m = sc.nextInt();
//             printPattern p = new printPattern();
//             p.printPat(m);
//             System.out.println();
//             n--;
//         }
//         sc.close();
//     }

//     private void printPat(int m) {
//         for (int i = m; i > 0; i--) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }





package DSA_GFG.L01Mathematics;

import java.util.Scanner;

public class printPattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int m = sc.nextInt();
            printPattern p = new printPattern();
            p.printPat(m);
            System.out.println();
            n--;
            sc.close();
        }
        
    }

    private void printPat(int m) {
        for (int i = m; i >= 1; i--) {
            for (int j = m; j >= 1; j--) {
                for (int k = 0; k < i; k++) {
                    System.out.print(j + " ");
                }
            }
            System.out.print("$");
        }
    }
}

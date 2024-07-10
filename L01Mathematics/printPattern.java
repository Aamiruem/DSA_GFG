package DSA_GFG.L01Mathematics;

import java.util.*;

public class printPattern {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n>0){
            int m = sc.nextInt();
            printPattern p = new printPattern();
            p.printPat(m);
            System.out.println();
            n--;
        }

    }


    private void printPat(int m) {
        
    }
    
}

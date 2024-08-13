package DSA_GFG.L01Mathematics;


    import java.util.Scanner;

public class L4GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the first term (a), common ratio (r), and the number of terms (n)
        System.out.print("Enter the first term (Amount): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the common ratio (Rate): ");
        int r = scanner.nextInt();
        
        System.out.print("Enter the number of terms (power of n): ");
        int n = scanner.nextInt();
        
        System.out.println("The Geometric Progression is:");
        
        // Loop to calculate and print each term of the GP
        for (int i = 0; i < n; i++) {
            int term = (int) (a * Math.pow(r, i));
            System.out.print(term + " ");
        }
        
        scanner.close();
    }
}

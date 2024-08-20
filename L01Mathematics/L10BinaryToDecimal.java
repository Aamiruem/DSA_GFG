// User function Template for Java
package DSA_GFG.L01Mathematics;

public class L10BinaryToDecimal {
    public int binary_to_decimal(String str) {
        int decimal = 0;  // Initialize the decimal result
        
        // Iterate over each character in the binary string
        for (int i = 0; i < str.length(); i++) {
            // Multiply the current decimal value by 2 to shift left in binary
            decimal = decimal * 2 + (str.charAt(i) - '0');
        }
        
        return decimal;  // Return the decimal value
    }
    public static void main(String[] args) {
        L10BinaryToDecimal obj = new L10BinaryToDecimal();
        String str = "1111";
        System.out.println("Decimal number is: " + obj.binary_to_decimal(str));

       String A = "10001000";
        System.out.println("Decimal number is: " + obj.binary_to_decimal(A));
        //136


        String B = "101100";
        System.out.println("Decimal number is: " + obj.binary_to_decimal(B));
        //44
    }
}

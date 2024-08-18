// Input: N = 12321
// Output: Yes
// Explanation: 12321 is a Palindrome number because after reversing its digits, the number becomes 12321 which is same as the original number.
// Input: N = 1234
// Output: No
// Explanation: 1234 is not a Palindrome number because after reversing its digits, the number becomes 4321 which is different from the original number.
package DSA_GFG.L01Mathematics;

public class L7SumOfDigitIsPalindrome {

    int isDigitSumPalindrome(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        int rev = 0;
        int temp = sum;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return sum == rev ? 1 : 0;
    }

    public static void main(String[] args) {

        L7SumOfDigitIsPalindrome obj = new L7SumOfDigitIsPalindrome();

        System.out.println(obj.isDigitSumPalindrome(123));
        
        System.out.println(obj.isDigitSumPalindrome(121));

    }
}

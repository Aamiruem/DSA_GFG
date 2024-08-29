package DSA_GFG.L01Mathematics;

public class L23PrimeCheck {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so n is not prime
            }
        }

        return true; // No divisors found, so n is prime
    }

    public static void main(String[] args) {
        int number = 29;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

package DSA_GFG.L01Mathematics;

public class L20PerfectNumbers {

    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 1; // Start with 1 because 1 is a proper divisor of any number

        // Loop to find divisors and calculate the sum of proper divisors
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) { // Add both divisors if they are different
                    sum += number / i;
                }
            }
        }

        // A perfect number is equal to the sum of its proper divisors
        return sum == number && number != 1;
    }

    // Method to print all perfect numbers up to a given limit
    public static void findPerfectNumbersUpTo(int limit) {
        System.out.println("Perfect numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int limit = 10000; // You can change this limit as needed
        findPerfectNumbersUpTo(limit);
    }
}

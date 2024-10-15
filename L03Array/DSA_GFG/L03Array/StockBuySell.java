// Example 1:

// Input:N=7 A[]={100,180,260,310,40,535,695}Output:1 Explanation:One possible solution is(0 3)(4 6)We can buy stock on day 0,and sell it on 3 rd day,which will give us maximum profit.Now,we buy stock on day 4 and sell it on day 6. Example 2:

// Input:N=5 A[]={4,2,2,2,4}Output:1 
// Explanation:There are multiple possible solutions.one of them is(3 4)We can buy stock on day 3,and sell it on 4 th day,which will give us maximum profit.



// Expected Time Complexity:O(N)
// Expected Auxiliary Space:O(N)




package DSA_GFG.L03Array;

import java.util.*;

public class StockBuySell {

    // Function to find the buy-sell days for maximum profit
    public static List<List<Integer>> stockBuySell(int[] A, int N) {
        List<List<Integer>> result = new ArrayList<>();

        int i = 0;

        // Traverse through the price array
        while (i < N - 1) {
            // Find local minima (buy day)
            while (i < N - 1 && A[i + 1] <= A[i]) {
                i++;
            }

            // If no further transaction is possible, break
            if (i == N - 1) {
                break;
            }

            // Buy day
            int buy = i;
            i++;

            // Find local maxima (sell day)
            while (i < N && A[i] >= A[i - 1]) {
                i++;
            }

            // Sell day
            int sell = i - 1;

            // Add the buy-sell pair to the result
            result.add(Arrays.asList(buy, sell));
        }

        // If no buy-sell pairs are found, return empty list
        return result;
    }

    public static void main(String[] args) {
        int[] A1 = { 100, 180, 260, 310, 40, 535, 695 };
        int N1 = A1.length;
        System.out.println(stockBuySell(A1, N1)); // Output: [[0, 3], [4, 6]]

        int[] A2 = { 4, 2, 2, 2, 4 };
        int N2 = A2.length;
        System.out.println(stockBuySell(A2, N2)); // Output: [[3, 4]]

        int[] A3 = { 5, 4, 3, 2, 1 };
        int N3 = A3.length;
        System.out.println(stockBuySell(A3, N3)); // Output: []
    }
}

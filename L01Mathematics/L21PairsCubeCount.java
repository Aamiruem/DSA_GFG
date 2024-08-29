package DSA_GFG.L01Mathematics;

import java.util.HashMap;
import java.util.Map;

public class L21PairsCubeCount {

    // Method to count pairs (a, b) such that a^3 + b^3 = c^3 + d^3
    public static int countPairsCube(int N) {
        // HashMap to store the sum of cubes and the count of corresponding pairs
        Map<Integer, Integer> cubePairsCount = new HashMap<>();
        int count = 0;

        for (int a = 1; a <= N; a++) {
            for (int b = a; b <= N; b++) {
                int sumCubes = a * a * a + b * b * b;

                // If the sum of cubes is already in the map, increment the count
                cubePairsCount.put(sumCubes, cubePairsCount.getOrDefault(sumCubes, 0) + 1);
            }
        }

        // Counting how many sums have more than one pair
        for (int pairs : cubePairsCount.values()) {
            if (pairs > 1) {
                count += pairs * (pairs - 1) / 2; // Count combinations of pairs
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int N = 100;  // You can change this limit to search for different ranges
        System.out.println("Number of distinct pairs where a^3 + b^3 = c^3 + d^3:");
        int pairCount = countPairsCube(N);
        System.out.println(pairCount);
    }
}

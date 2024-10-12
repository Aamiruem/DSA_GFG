package DSA_GFG.L02Puzzles;

import java.util.HashMap;

public class isSquares {

    // Helper function to calculate the squared distance between two points
    private static int distanceSquared(int x1, int y1, int x2, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }

    public static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // Calculate the squared distances between all pairs of points
        HashMap<Integer, Integer> distanceCount = new HashMap<>();
        
        int[] points = {
            x1, y1,
            x2, y2,
            x3, y3,
            x4, y4
        };

        // Calculate distances for each pair of points
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int dist = distanceSquared(points[i * 2], points[i * 2 + 1], points[j * 2], points[j * 2 + 1]);
                distanceCount.put(dist, distanceCount.getOrDefault(dist, 0) + 1);
            }
        }

        // A square should have exactly two distinct distances
        // - 4 equal sides (4 occurrences)
        // - 2 equal diagonals (2 occurrences)
        if (distanceCount.size() == 2) {
            for (int count : distanceCount.values()) {
                if (count != 4 && count != 2) {
                    return "No"; // If the counts are not 4 and 2, return No
                }
            }
            return "Yes"; // The points form a square
        }
        return "No"; // The points do not form a square
    }

    // Example Usage
    public static void main(String[] args) {
        System.out.println(isSquare(20, 10, 10, 20, 20, 20, 10, 10));  // Output: Yes
        System.out.println(isSquare(2, 1, 10, 20, 5, 6, 10, 10));      // Output: No
    }
}

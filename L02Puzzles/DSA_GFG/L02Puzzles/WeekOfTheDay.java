// Input:
// d = 28, m = 12, y = 1995
// Output:
// Thursday
// Explanation:
// 28 December 1995 was a Thursday.
// Example 2:

// Input:
// d = 30, m = 8, y = 2010
// Output:
// Monday
// Explanation:
// 30 August 2010 was a Monday.


// Expected Time Complexity: O(1)
// Expected Auxiliary Space: O(1)



package DSA_GFG.L02Puzzles;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekOfTheDay {
    public String getDayOfWeek(int d, int m, int y) {
        // Create a LocalDate object with the given day, month, and year
        LocalDate date = LocalDate.of(y, m, d);

        // Get the day of the week for the given date
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Return the day of the week as a string (like "Monday", "Tuesday", etc.)
        return dayOfWeek.toString().substring(0, 1) + dayOfWeek.toString().substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        WeekOfTheDay obj = new WeekOfTheDay();
        System.out.println(obj.getDayOfWeek(28, 12, 1995));
    }
}

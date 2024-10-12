package DSA_GFG.L02Puzzles;

public class WatchAngles {

    public int getAngle(int H, int M) {
        // Adjust hour if it's greater than 12 (because it's a 12-hour clock)
        if (H >= 12) {
            H -= 12;
        }

        // Calculate the angle moved by the minute hand
        int minuteAngle = 6 * M;

        // Calculate the angle moved by the hour hand
        double hourAngle = (30 * H) + (0.5 * M);

        // Calculate the absolute difference between the two angles
        double angle = Math.abs(hourAngle - minuteAngle);

        // Get the smaller of the two possible angles
        angle = Math.min(angle, 360 - angle);

        // Return the floor value of the result
        return (int) Math.floor(angle);
    }

    public static void main(String[] args) {
        WatchAngles obj = new WatchAngles();
        int H = 3;
        int M = 30;
        int result = obj.getAngle(H, M);
        System.out.println(result);
    }
}

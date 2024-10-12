// Input:N=2 Output:1 Explanation:Initially all doors are closed.After 1 st go,all doors will be opened.After 2 nd go second door will be closed.So,Only 1 st door will remain Open.





package DSA_GFG.L02Puzzles;

public class NumberOfDoors {

    public int noOfOpenDoors(long N) {
        // The number of open doors is the count of perfect squares <= N.
        // This is simply the floor of the square root of N.
        return (int) Math.sqrt(N);
    }

    public static void main(String[] args) {
        System.out.println("""
                           Following the sequence 4 times, we can\r
                           see that only 1st and 4th doors will\r
                           remain open.""" //
        //
        );
        NumberOfDoors obj = new NumberOfDoors();
        System.out.println(obj.noOfOpenDoors(4));
    }
}

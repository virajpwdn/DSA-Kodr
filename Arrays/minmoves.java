package Arrays;

import java.util.Arrays;

public class minmoves {
    public int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for(int i=0; i<seats.length; i++){
            moves += Math.abs(seats[i]-students[i]);
        }
        return moves;
    }
    public static void main(String[] args) {
        minmoves obj = new minmoves();
        int seats[] = {3,1,5};
        int students[] = {2,7,4};
        System.out.println(obj.minMovesToSeat(seats, students));
    }
}

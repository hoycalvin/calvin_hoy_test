import java.util.*;

public class Q1{ 
	public static Boolean overlap(int x1, int x2, int y1, int y2){
        //checks if the intervals have any overlap by using endpoints
        //i.e 1 <= 6? 2 <= 5? If true, they overlap
        if(x1 > x2 || y1 > y2){
            throw new java.lang.RuntimeException("These intervals make no sense.");
        }

        if(x1 <= y2 && y1 <= x2){
            System.out.println("These lines overlap.");
            return true;
        }else{
            System.out.println("These lines do not overlap.");
            return false;
        }
    }

    public static void main(String[] args) {
        overlap(1,5,2,6);
        overlap(1,5,6,8);
        overlap(0,1,1,5); //test case: only one single point of overlap
        // overlap(5,1,2,6); //test case: bad intervals, will cause a runtime exception. keep uncommented.
    }
}

/* Missing functionality: Could have implemented a user input by using Scanner subclass,
however, I judged it unnecessary, since if this was integrated into a larger system,
it could cause some integration problems. Therefore, I opted for main line calls.
*/
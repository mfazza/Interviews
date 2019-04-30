// you can also use imports, for example:
//import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B) {

        int wholeSquares = 0;
        for (int i = A; i <= B; i++) {

            // the integer conversion allows for the comparisson on line 15 to be cohesive
            int root = (int) Math.sqrt(i);
            if (Math.pow(root, 2) == i) {
                wholeSquares++;
            }

        }

        return wholeSquares;

    }
}
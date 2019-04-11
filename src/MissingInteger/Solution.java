
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int smallestMissing = 1;

        int setSize = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], 1);
        }

        for (int j = 1; j <= 100000; j++) {
            if (map.containsKey(j) == false) {
                smallestMissing = j;
                break;
            }
        }
        return smallestMissing;
    }
}

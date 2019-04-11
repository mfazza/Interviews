
//This implementation is bottlenecked by HashMap (that has a limit)
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // populate hashmap with values
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i]) == false) {
                map.put(A[i], 1);
            } else {
                map.replace(A[i], 2);
            }
        }

        int lonelyInt = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                lonelyInt = key;
            }
        }

        return lonelyInt;

    }
}

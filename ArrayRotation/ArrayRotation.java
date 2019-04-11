// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // A is the array
        // K is the number of times it shifts

        for (int j = 0; j < K; j++) {
            rotateByOne(A);
        }

        return A;

    }

    public static void rotateByOne(int[] A) {
        int i;
        int temp = A[A.length - 1];
        for (i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }
        A[i] = temp;
    }

}
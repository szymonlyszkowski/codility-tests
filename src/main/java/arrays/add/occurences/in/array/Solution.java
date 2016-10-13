package arrays.add.occurences.in.array;

import java.util.Arrays;

/**
 * 100%
 */
public class Solution {
    public int solution(int[] A) {
        if (A.length == 1)
            return A[0];
        Arrays.sort(A);
        int lastValue = -1;
        for (int i = 1; i < A.length; ++i) {
            int previousElement = A[i - 1];
            if (A[i] == previousElement) {
                ++i;
            }else{
                return previousElement;
            }
            lastValue = i;
        }
        return A[lastValue];
    }
}

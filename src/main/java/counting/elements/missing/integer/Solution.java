package counting.elements.missing.integer;

import java.util.Arrays;

/**
 * 100 % At first attempt!
 */
public class Solution {

    public int solution(int[] A) {
        Arrays.sort(A);
        int positiveCounter = 1;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] <= 0)
                continue;
            if(i>=1 && A[i] == positiveCounter-1 && A[i-1]== positiveCounter-1){
                continue;
            }
            if (A[i] == positiveCounter) {
                ++positiveCounter;
                continue;
            } else {
                break;
            }

        }
        return positiveCounter;
    }
}

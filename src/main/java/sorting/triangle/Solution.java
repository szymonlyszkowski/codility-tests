package sorting.triangle;

import java.util.Arrays;

/**
 * 100%
 */
public class Solution {

    public int solution(int[] A) {
        if (A.length < 3)
            return 0;
        Arrays.sort(A);
        for (int i = 1; i < A.length - 1; ++i) {
            Long sum = new Long(A[i - 1]) + new Long(A[i]);
            if(sum>new Long(A[i+1]))
                return 1;
        }
        return 0;
    }
}

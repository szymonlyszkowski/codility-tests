package counting.elements.perm.check;

import java.util.Arrays;

/**
 * 100%
 */
public class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; ++i) {
            if (A[i] != i + 1)
                return 0;
        }
        return 1;
    }
}

package time.complexity.perm.missing.element;

import java.util.Arrays;

/**
 * 100%
 */
public class Solution {
    public int solution(int[] A) {
        if (A.length == 1 && A[0] == 1)
            return 2;
        if (A.length == 1 && A[0] == 2)
            return 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; ++i) {
            if (i + 1 != A[i])
                return i + 1;
        }
        return A.length + 1;
    }
}

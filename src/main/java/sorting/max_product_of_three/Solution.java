package sorting.max_product_of_three;

import java.util.Arrays;
/**
 * 100%
 */
public class Solution {

    public int solution(int[] A) {
        if (A.length == 3) {
            return A[0] * A[1] * A[2];
        }
        Arrays.sort(A);

        for (int i = 0; i < A.length; ++i) {

        }
        int maxUsingNegativeValue = A[0] * A[1] * A[A.length - 1];
        int maxUsingPositiveValue = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];

        if (maxUsingNegativeValue > maxUsingPositiveValue)
            return maxUsingNegativeValue;
        return maxUsingPositiveValue;
    }
}
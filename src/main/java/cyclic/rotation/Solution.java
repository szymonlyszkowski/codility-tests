package cyclic.rotation;

/**
 * 100%
 */

public class Solution {
    public int[] solution(int[] A, int K) {
        if (K == 0)
            return A;
        int arrayLength = A.length;
        if (K == arrayLength)
            return A;
        if (A.length == 0 || A.length == 1)
            return A;
        int[] rotatedArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            int indexAfterRotationByK = i + K;
            if (indexAfterRotationByK < arrayLength) {
                rotatedArray[indexAfterRotationByK] = A[i];
            } else {
                int indexOverflowed = indexAfterRotationByK % arrayLength;
                rotatedArray[indexOverflowed] = A[i];
            }
        }
        return rotatedArray;
    }
}

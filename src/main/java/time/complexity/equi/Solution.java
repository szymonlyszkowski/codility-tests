package time.complexity.equi;

/**
 * Created by lyszkows on 15/10/2016.
 */
public class Solution {

    public int solution(int[] A) {
            if(A.length ==0){
                return -1;
            }
            if(A.length==1){
                 return 0;
            }

            if (A.length == 2) {
                if (A[0] - A[1]==0) {
                    return 0;
                }
                return -1;
            }

        int reverseIterator = A.length - 1;
        int[] countingFromLeftSideSlices = new int[A.length - 1];
        int[] countingFromRightSideSlices = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; ++i) {
            if (i == 0)
                countingFromLeftSideSlices[i] = A[i];
            else {
                countingFromLeftSideSlices[i] = A[i] + countingFromLeftSideSlices[i - 1];
            }
            if (reverseIterator == A.length - 1) {
                countingFromRightSideSlices[reverseIterator - 1] = A[reverseIterator];
            } else {
                countingFromRightSideSlices[reverseIterator - 1] = A[reverseIterator] + countingFromRightSideSlices[reverseIterator];
            }
            --reverseIterator;
        }

        if(A.length%2==1){
            for (int i = 0; i < A.length - 1; ++i){
                if(countingFromLeftSideSlices[i]-countingFromRightSideSlices[i] ==0){
                    return i;
                }
            }
        }
        if(A.length%2==0) {
            for (int i = 0; i < A.length - 1; ++i) {
                if (countingFromLeftSideSlices[i] - countingFromRightSideSlices[i + 1] == 0) {
                    return i + 1;
                }
            }
        }


        return -1;
    }

}

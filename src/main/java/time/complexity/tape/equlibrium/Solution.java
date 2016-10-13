package time.complexity.tape.equlibrium;

import java.util.Arrays;

/**
 * 100%
 */
public class Solution {


    public int solution(int[] A) {

        if(A.length==2){
            return Math.abs(A[0]-A[1]);
        }

        int reverseIterator = A.length - 1;
        int[] countingFromLeftSideSlices = new int[A.length-1];
        int[] countingFromRightSideSlices = new int[A.length-1];
        int[] resultsArray = new int[A.length-1];

        for (int i = 0; i < A.length-1; ++i) {
            if (i == 0)
                countingFromLeftSideSlices[i] = A[i];
            else {
                countingFromLeftSideSlices[i] = A[i] + countingFromLeftSideSlices[i - 1];
            }
            if(reverseIterator==A.length-1){
                countingFromRightSideSlices[reverseIterator-1] = A[reverseIterator];
            }else{
                countingFromRightSideSlices[reverseIterator-1] = A[reverseIterator] + countingFromRightSideSlices[reverseIterator];
            }
            --reverseIterator;
        }

        for(int i=0; i<A.length-1; ++i){
           resultsArray[i] = Math.abs(countingFromLeftSideSlices[i]-countingFromRightSideSlices[i]);
        }
        Arrays.sort(resultsArray);

        return resultsArray[0];
    }

}

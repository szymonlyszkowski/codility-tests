package sorting.numberOfDiscIntersections;

import java.util.Arrays;

/**
 * j-i≤A[i]+A[j] <=> A[i]+i ≥ -(A[j]-j)
 */
public class Solution{
    public int solution(int[] A){
        if(A.length==0 || A.length==1){
            return 0;
        }

        long [] circlesOne = new long [A.length];
        long [] circlesTwo = new long [A.length];

        for(int i=0; i<A.length-1; ++i){
            circlesOne[i] = new Long(new Long(A[i])+new Long(i));
            circlesTwo[i+1] = new Long(-(new Long(A[i+1])-new Long(i+1)));
        }
        Arrays.sort(circlesOne);
        Arrays.sort(circlesTwo);
        int pairs = 0;
        for(int i=0; i<A.length; ++i){
            if(circlesOne[i]>=circlesTwo[i]){
                ++pairs;
            }
        }
        if(pairs>10000000)
            return -1;
        return pairs;

    }
}

package leader.dominator;

import java.util.Arrays;

/**
 * Created by lyszkows on 18/10/2016.
 */
public class Solution {
    public int solution(int[] A){
        if (A.length == 0)
            return -1;
        int[] copy = Arrays.copyOf(A, A.length);
        Arrays.sort(copy);
        int dominatorIndex=copy.length/2;
        int dominatorValue=copy[dominatorIndex];
        if(A.length%2==0 && copy[dominatorIndex -1]!= dominatorValue){
            return -1;
        }
        for(int i=0; i<A.length; ++i){
            if(A[i] == dominatorValue)
                return i;
        }
        return -1;
    }
}

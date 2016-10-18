package leader.equiLeader;

import java.util.Arrays;

/**
 * Created by lyszkows on 18/10/2016.
 */
public class Solution {
    public int solution(int[] A){
        if (A.length == 1)
            return -1;

        int[] copy = Arrays.copyOf(A, A.length);
        Arrays.sort(copy);
        int dominatorIndex=copy.length/2;
        int dominatorValue=copy[dominatorIndex];


        for(int i=0; i<A.length; ++i){


            if(A[i] == dominatorValue)
                return i;
        }
        return -1;


    }
}

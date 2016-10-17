package sorting.distinct;

import java.util.Arrays;

/**
 * Created by szymonidas on 10/17/16.
 */
public class Solution {
    public int solution(int[] A){
        if(A.length==0)
            return 0;
        if(A.length==1)
            return 1;
        int counter =1;
        Arrays.sort(A);
        for(int i=1; i<A.length; ++i){
            if(A[i] != A[i-1]){
                ++counter;
            }

        }
        return counter;
    }

}

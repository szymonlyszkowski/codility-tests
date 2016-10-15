package counting.elements.frog.river.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Correctness 100% , Performance 40%.
 */
public class Solution {
    public int solution(int X, int[] A){
        List requiredLeaves = new ArrayList<Integer>();
        for(int i=0; i<X; ++i){
            requiredLeaves.add(i+1);
        }
        for(int i=0; i<A.length; ++i){
            if(i<A.length-1 && A[i]== A[i+1] && !requiredLeaves.contains(new Integer(A[i])))
                continue;
            if(A[i]<=X && requiredLeaves.contains(new Integer(A[i]))){
                requiredLeaves.remove(new Integer(A[i]));
            }
            if(requiredLeaves.isEmpty())
                return i;
        }

        return -1;
    }
}

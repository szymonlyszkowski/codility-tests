package counting.elements.frog.river.one;

import java.util.HashSet;
import java.util.Set;

/**
 * Correctness 100% , Performance 100%.
 * Do not use ArrayList during case where all elements are distinct.
 * In such case we should use HashSet, performance is much better.
 */
public class Solution {
    public int solution(int X, int[] A){
        Set requiredLeaves = new HashSet<Integer>();
        for(int i=0; i<X; ++i){
            requiredLeaves.add(i+1);
        }
        for(int i=0; i<A.length; ++i){
            if(requiredLeaves.contains(new Integer(A[i]))){
                requiredLeaves.remove(new Integer(A[i]));
            }
            if(requiredLeaves.isEmpty())
                return i;
        }

        return -1;
    }
}

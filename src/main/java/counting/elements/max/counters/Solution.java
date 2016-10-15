package counting.elements.max.counters;

import java.util.*;
/**
 * Correctness 100%, Performance 40%.
 */
public class Solution {

    public int[] solution(int N, int[] A){
        HashMap<Integer,Integer> counters = new HashMap<>();
        List<Integer> listCounters = new ArrayList(Collections.nCopies(N, 0));

        for(int i=0; i<listCounters.size(); ++i){
            counters.put(new Integer(i),listCounters.get(i));
        }

        for(int K=0; K<A.length; ++K){

            if(counters.containsKey(A[K]-1)){
                Integer value = counters.get(A[K]-1);
                counters.replace(A[K]-1,value +1);
            }
            if(A[K] == N +1){
                Integer max = Collections.max(counters.values());
                counters.replaceAll((k,v)->max);
            }

        }
       int[] result =  new int[N];
       for(int i=0; i<result.length; ++i){
           result[i] = counters.get(i);
       }
        return result;
    }
}

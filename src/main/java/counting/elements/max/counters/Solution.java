package counting.elements.max.counters;

import java.util.*;

/**
 * Correctness 100%, Performance 40%.
 */
public class Solution {

    public int[] solution(int N, int[] A) {
//        TreeMap<Integer, Integer> counters = new TreeMap<>();
        List<Integer> listCounters = new ArrayList(Collections.nCopies(N, 0));

//        for (int i = 0; i < listCounters.size(); ++i) {
//            counters.put(new Integer(i), listCounters.get(i));
//        }
        int maxValue = 0;
        int minValue = 0;
        for (int K = 0; K < A.length; ++K) {

            if (listCounters.contains(A[K] - 1)) {

                    Integer value = listCounters.get(A[K] - 1);
                    listCounters.set(A[K] - 1, value + 1);
                    maxValue = value +1;
            }
            if (A[K] == N + 1) {
                Integer max = Collections.max(listCounters);
                maxValue = max;
                minValue = maxValue;
            }

        }



//        Object[] r = counters.values().toArray();
        int[] result = new int[N];
        for (int i = 0; i < listCounters.size(); ++i) {
            if(listCounters.get(i) < minValue){
                listCounters.set(i, minValue);
            }
            result[i] = listCounters.get(i);
        }
        return result;
    }
}

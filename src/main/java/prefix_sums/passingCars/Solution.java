package prefix_sums.passingCars;

/**
 * 100%
 */
public class Solution {
    public int solution(int[] A){
        if(A.length==1){
            return 0;
        }
        if(A.length==2){
            if((A[0] == 0 && A[1]==1)){
                return 1;
            }
            return 0;
        }

        int[] prefixSums = calculatePrefixSumsFromRight(A);
        long passingCars = 0;
        for(int i=0; i<A.length-1; ++i){
            if(A[i] == 0){
              passingCars = passingCars+prefixSums[i+1];
            }
        }
        if(passingCars>1000000000){
            return -1;
        }

        return (int)passingCars;
    }


    private int [] calculatePrefixSumsFromRight(int [] A){
        int [] prefixSumsFromRight = new int [A.length];
        for(int i=A.length-1; i>-1; --i){
            if(i == A.length-1){
                prefixSumsFromRight[i] = A[i];
                continue;
            }
            prefixSumsFromRight[i] = prefixSumsFromRight[i+1]+A[i];
        }
        return prefixSumsFromRight;
    }
}

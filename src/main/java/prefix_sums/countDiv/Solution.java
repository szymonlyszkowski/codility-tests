package prefix_sums.countDiv;


/**
 * Created by lyszkows on 16/10/2016.
 */
public class Solution {
    public int solution(int A, int B, int K){
        return countDivisors(A,B,K);
    }
    private int countDivisors(int min, int max, int div) {
        int count = (max - min) / div;
        if (min % div == 0 || max % div == 0)
            count++;
        return count;
    }
}

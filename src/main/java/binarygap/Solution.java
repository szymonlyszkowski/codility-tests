package binarygap;

/**
 * 100 %
 */
public class Solution {

    public int solution(int N){
        String binaryString = Integer.toBinaryString(N);
        if (binaryString.length() ==0 || binaryString.length()==1 || binaryString.length() ==2)
            return 0;
        int firstOneDigitIndex =0 ;
        int secondOneDigitIndex = 0;
        boolean firstIndexFound = false;
        boolean secondIndexFound = false;
        int longestSlice = 0;
        for(int i=0; i<binaryString.length(); ++i){
          if(!firstIndexFound && binaryString.charAt(i) == '1'){
             firstOneDigitIndex = i;
              firstIndexFound = true;
          }
          if(firstIndexFound && binaryString.charAt(i) == '1'){
              secondIndexFound = true;
              secondOneDigitIndex = i;
          }

          if(firstIndexFound && secondIndexFound){
              int sliceLength = (secondOneDigitIndex-firstOneDigitIndex)-1;
             if(longestSlice< sliceLength){
                 longestSlice = sliceLength;
             }
             firstIndexFound = false;
              secondIndexFound = false;
              if(i+1<binaryString.length() && binaryString.charAt(secondOneDigitIndex+1)=='0'){
                  firstIndexFound = true;
                  firstOneDigitIndex = secondOneDigitIndex;
              }

          }

        }
        return longestSlice;
    }
}

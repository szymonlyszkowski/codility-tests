package arrays.cyclic.rotation

import arrays.cyclic.rotation.Solution
import spock.lang.Specification


/**
 * Created by lyszkows on 12/10/2016.
 */
class CyclicRotationSpec extends Specification {

    def "Test should rotate array [1,2,3]"(){
        given:
        def inputArray = [1,2,3] as int []
        expect:
         new Solution().solution(inputArray,1) == [3,1,2]
         new Solution().solution(inputArray,2) == [2,3,1]
         new Solution().solution(inputArray,3) == [1,2,3]
         new Solution().solution(inputArray,0) == [1,2,3]
    }

    def "Test should rotate array [1,2,3,4]"(){
        given:
        def inputArray = [1,2,3,4] as int []
        expect:
         new Solution().solution(inputArray,1) == [4,1,2,3]
         new Solution().solution(inputArray,2) == [3,4,1,2]
         new Solution().solution(inputArray,3) == [2,3,4,1]
         new Solution().solution(inputArray,0) == [1,2,3,4]
    }

    def "Test maximal 5 elements and rotation is 10"(){
        given:
        def inputArray = [1,2,3,4,5] as int[]
        when:
        def result = new Solution().solution(inputArray, 10)
        then:
        result == [1,2,3,4,5]

    }

}
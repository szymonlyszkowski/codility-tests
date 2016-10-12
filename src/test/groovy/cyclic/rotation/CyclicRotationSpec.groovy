package cyclic.rotation

import spock.lang.Specification


/**
 * Created by lyszkows on 12/10/2016.
 */
class CyclicRotationSpec extends Specification {

    def "Test should rotate array [1,2,3]"(){
        given:
        def inputArray = [1,2,3] as int []
        expect:
        [3,1,2] == new Solution().solution(inputArray,1)
        [2,3,1] == new Solution().solution(inputArray,2)
        [1,2,3] == new Solution().solution(inputArray,3)
        [1,2,3] == new Solution().solution(inputArray,0)
    }

    def "Test should rotate array [1,2,3,4]"(){
        given:
        def inputArray = [1,2,3,4] as int []
        expect:
        [4,1,2,3] == new Solution().solution(inputArray,1)
        [3,4,1,2] == new Solution().solution(inputArray,2)
        [2,3,4,1] == new Solution().solution(inputArray,3)
        [1,2,3,4] == new Solution().solution(inputArray,0)
    }

}
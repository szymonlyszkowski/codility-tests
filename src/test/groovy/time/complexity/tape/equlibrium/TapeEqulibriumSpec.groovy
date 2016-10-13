package time.complexity.tape.equlibrium

import spock.lang.Specification
import time.complexity.tape.equlibrium.Solution


/**
 * Created by szymonidas on 10/13/16.
 */
class TapeEqulibriumSpec extends Specification {

    def "Basic test case"(){
        given:
        def inputArray = [3,1,2,4,3] as int[]
        when:
        def result = new Solution().solution(inputArray)
        then:
        result == 1
    }

    def "Test two elements array"(){
        expect:
        new Solution().solution([-1,2] as int[]) == 3
        new Solution().solution([1,1] as int []) == 0
    }

    def "Test even array"(){
        expect:
        new Solution().solution([-1,2,3,-9] as int[]) == 3
    }


}
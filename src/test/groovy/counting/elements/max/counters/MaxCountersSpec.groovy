package counting.elements.max.counters

import spock.lang.Specification


/**
 * Created by lyszkows on 15/10/2016.
 */
class MaxCountersSpec extends Specification {

    def "Test from example"(){
        given:
        def result = [3, 2, 2, 4, 2] as int []
        expect:
        new Solution().solution(5,[3,4,4,6,1,4,4] as int[]) ==  result;
    }

    def "Test one counter"(){
        expect:
        new Solution().solution(1, [3,4,5,2,1,4,20] as int []) == [1] as int []
        new Solution().solution(1, [1,1,1,1,1,1,1] as int []) == [7] as int []
    }



}
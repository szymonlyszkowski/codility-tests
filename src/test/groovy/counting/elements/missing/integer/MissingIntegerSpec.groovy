package counting.elements.missing.integer

import spock.lang.Specification


/**
 * Created by szymonidas on 10/13/16.
 */
class MissingIntegerSpec extends Specification {

    def "Test odd and even array length"(){
        expect:
        new Solution().solution([1,6,3,2,4] as int []) == 5
        new Solution().solution([1,6,3,2,4,7] as int []) == 5
        new Solution().solution( [1, 3, 6, 4, 1, 2] as int []) == 5
    }

    def "Test one positive element"(){
        expect:
        new Solution().solution([0] as int []) == 1
        new Solution().solution([1] as int []) == 2
    }

    def "Test one negative element"(){
        expect:
        new Solution().solution([-2] as int []) == 1
    }

    def "Test maximal and minimal elements"(){
        expect:
        new Solution().solution([-2147483648,-3,2147483648] as int []) == 1
    }

}
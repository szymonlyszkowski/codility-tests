package sorting.distinct

import spock.lang.Specification


/**
 * Created by szymonidas on 10/17/16.
 */
class DistinctSpec extends Specification {
    def "Test from example"(){
        expect:
        new Solution().solution([2,1,1,2,3,1] as int []) == 3
    }


    def "Test one element in array"(){
        expect:
        new Solution().solution([1]as int []) == 1
        new Solution().solution([2]as int []) == 1
        new Solution().solution([3]as int []) == 1
        new Solution().solution([0]as int []) == 1
        new Solution().solution([-1]as int []) == 1
    }

    def "Test multiple elements"(){
        expect:
        new Solution().solution([-1,1,1,5,10,20,1]as int []) == 5
        new Solution().solution([0,-9,9,10]as int []) == 4
        new Solution().solution([1,10,-20,1,-20]as int []) == 3
    }
}
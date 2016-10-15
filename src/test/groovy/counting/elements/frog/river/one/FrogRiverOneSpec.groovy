package counting.elements.frog.river.one

import spock.lang.Specification


/**
 * Created by lyszkows on 15/10/2016.
 */
class FrogRiverOneSpec extends Specification {

    def "Test from example"(){
        given:
        def exampleArray = [1,3,1,4,2,3,5,4] as int []
        expect:
        new Solution().solution(5,exampleArray) == 6
    }

    def "Test should find not path to pass river"(){
        given:
        def exampleArray = [1,3,1,4,2,3,5,4] as int []
        expect:
        new Solution().solution(10,exampleArray) == -1
    }

    def "Test a lot of unnecessary leaves"(){
        given:
        def exampleArray = [10,54,10000,4,4,1,2,3,4,5] as int []
        expect:
        new Solution().solution(5,exampleArray) == 9
    }

    def "Test small amount of elements in array"(){
        expect:
        new Solution().solution(1, [1] as int []) == 0
        new Solution().solution(2, [1,2] as int []) == 1
        new Solution().solution(3, [1,2] as int []) == -1
    }
    def "Test from codility"(){
        expect:
        new Solution().solution(3, [1, 3, 1, 3, 2, 1, 3] as int []) == 4
        new Solution().solution(3, [1, 3, 1, 3, 2, 2,1, 3] as int []) == 4
    }



}
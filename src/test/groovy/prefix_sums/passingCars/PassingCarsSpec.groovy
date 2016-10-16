package prefix_sums.passingCars

import spock.lang.Specification


/**
 * Created by lyszkows on 16/10/2016.
 */
class PassingCarsSpec extends Specification {

    def "Test from example"(){
        given:
        def exampleInput = [0,1,0,1,1] as int[]
        expect:
        new Solution().solution(exampleInput) == 5
    }

    def "Test not all should be included"(){
        expect:
        new Solution().solution([1,0,1,0,0,1] as int []) == 4
    }

    def "Array even length"(){
        expect:
        new Solution().solution([0,0,1,1,0,1] as int []) == 7
    }

    def "Test two array elements"(){
        expect:
        new Solution().solution([0,0] as int []) == 0
        new Solution().solution([1,0] as int []) == 0
        new Solution().solution([0,1] as int []) == 1
        new Solution().solution([1,1] as int []) == 0
    }

    def "Test three array elements"(){
        expect:
        new Solution().solution([0,0,0] as int []) == 0
        new Solution().solution([0,0,1] as int []) == 2
        new Solution().solution([0,1,1] as int []) == 2
        new Solution().solution([0,1,0] as int []) == 1
        new Solution().solution([1,0,0] as int []) == 0
        new Solution().solution([1,1,0] as int []) == 0
        new Solution().solution([1,1,1] as int []) == 0
    }



}
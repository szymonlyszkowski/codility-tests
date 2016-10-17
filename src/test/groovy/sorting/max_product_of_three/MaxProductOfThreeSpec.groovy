package sorting.max_product_of_three

import spock.lang.Specification


/**
 * Created by lyszkows on 17/10/2016.
 */
class MaxProductOfThreeSpec extends Specification {

    def "Test from example"(){
        expect:
        new Solution().solution([-3,1,2,-2,5,6] as int[]) == 60
    }

    def "Tests 3 elements"(){
        expect:
        new Solution().solution([-1,-1,-1] as int []) == -1
        new Solution().solution([-1,-1,1] as int []) == 1
        new Solution().solution([-1,-1,0] as int []) == 0
    }
    def "Tests 4 elements"(){
        expect:
        new Solution().solution([-1,-1,1,5] as int []) == 5
        new Solution().solution([-1,0,1,6] as int []) == 0
        new Solution().solution([-5,-5,1,5,10] as int []) == 250
    }

    def "Tests 5 elements"(){
        expect:
        new Solution().solution([-1,-1,1,5,10] as int []) == 50
        new Solution().solution([-50,-1,0,1,2,6] as int []) == 300
        new Solution().solution([-50,-50,100,100,100] as int []) == 1000000
    }
}
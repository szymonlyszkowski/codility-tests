package sorting.triangle

import spock.lang.Specification


/**
 * Created by szymonidas on 10/17/16.
 */
class TriangleSpec extends Specification {

    def "Test from example"(){
        expect:
        new Solution().solution([10,2,5,1,8,20] as int []) == 1
    }

    def "Test 3 max ints"(){
        expect:
        new Solution().solution([2147483646, 2147483645, 2147483647] as int []) == 1
    }

}
package counting.elements.perm.check

import spock.lang.Specification


/**
 * Created by szymonidas on 10/13/16.
 */
class PermCheckSpec extends Specification {

    def "Test should assert array is permutation"(){
        expect:
        new Solution().solution([1,2,3] as int []) == 1
    }

    def "Test should assert array is not permutation"(){
        expect:
        new Solution().solution([1,3] as int[]) == 0
    }

    def "Test should assert one element array is permutation "(){
        expect:
        new Solution().solution([1] as int []) == 1
    }

    def "Test should assert one element array is not permutation "(){
        expect:
        new Solution().solution([2] as int []) == 0
        new Solution().solution([0] as int []) == 0
    }
}
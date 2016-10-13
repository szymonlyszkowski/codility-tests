package time.complexity.perm.missing.element

import spock.lang.Specification


/**
 * Created by szymonidas on 10/13/16.
 */
class PermMissingElementSpec extends Specification {

    def "Input array is 1 length"(){
        expect:
        new Solution().solution([1] as int [])== 2
        new Solution().solution([2] as int []) == 1
    }

    def "Double elements"(){
        expect:
        new Solution().solution([1,3] as int []) == 2
    }

    def "Missing first element"(){
        expect:
        new Solution().solution([2,3,4,5] as int []) == 1
        new Solution().solution([2,3] as int []) == 1
    }
    def "Missing last element"(){
        expect:
        new Solution().solution([1,2] as int []) == 3
    }

    def "Test from example lenght is even"(){
        expect:
        new Solution().solution([2,3,1,5]as int[]) == 4
    }

    def "Test array length is odd"(){
        expect:
        new Solution().solution([1,2,3,5,6] as int []) == 4
    }

}
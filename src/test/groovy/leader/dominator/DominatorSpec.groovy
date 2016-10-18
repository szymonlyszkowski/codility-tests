package leader.dominator

import spock.lang.Specification


/**
 * 83% No clue why two tests are failing.
 */
class DominatorSpec extends Specification {

    def "Test from example"(){
        expect:
        new Solution().solution([3,4,3,2,3,-1,3,3] as int []) == 0
        new Solution().solution([1,2,2] as int []) == 1
        new Solution().solution([1,1,1,1] as int []) == 0
        new Solution().solution([3,3,4,4] as int []) == -1
        new Solution().solution([3,3,4,4,4] as int []) == 2
        new Solution().solution([0,0,1,1,1] as int []) == 2
        new Solution().solution([1,1,3,5,8,11,0,0,1,1,1] as int []) == 0

    }

}
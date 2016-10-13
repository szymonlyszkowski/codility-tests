package time.complexity.frog.jump

import spock.lang.Specification


/**
 * Created by szymonidas on 10/13/16.
 */
class FrogJumpSpec extends Specification {

    def "Test should return 0 jumps when starting point is destination point"(){
        expect:
        new Solution().solution(10,10,100) == 0
    }

    def "Test should return 1 step when starting point 0, destination 50, jump 100"(){
        expect:
        new Solution().solution(0,50,100) == 1
    }

    def "Test case from FrogJump.MD"(){
        expect:
        new Solution().solution(10,85,30) == 3
    }

    def "Test case destination and jump equal"(){
        expect:
        new Solution().solution(0,50,50) == 1
        new Solution().solution(1,50,50) == 1
    }

}
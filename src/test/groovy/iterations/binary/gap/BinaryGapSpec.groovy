package iterations.binary.gap

import iterations.binary.gap.binary.gap.Solution
import spock.lang.Specification

/**
 * Created by szymonidas on 10/11/16.
 */
class BinaryGapSpec extends Specification{

    def "Test binary gap should be length 2 when input 1902"(){
        expect:
           new Solution().solution(1902) == 1
    }

    def "Test binary gap should be length 3 when input 125721"(){
        expect:
        new Solution().solution(125721) == 3
    }

    def "Test binary gap should be length 2 when input 1000000921"(){
        expect:
        new Solution().solution(1000000921) == 2
    }

    def "Test binary gap should be length 9 when input 16796640"(){
        expect:
        new Solution().solution(16796640) == 9
    }
}

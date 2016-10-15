package add.occurences.in.array

import spock.lang.Specification

/**
 * Created by szymonidas on 10/12/16.
 */
class AddOccurencesInArraySpec extends Specification {

    def "Expectation for arrays"(){
        expect:
        7 == new Solution().solution([1,2,3,7,1,2,3] as int[])
        1 == new Solution().solution([1,2,2,3,3,4,4] as int[])
        9 == new Solution().solution([2,2,3,3,4,4,9] as int[])
        8 == new Solution().solution([2,2,8,3,3,4,4] as int[])
        42 == new Solution().solution([42] as int[])

    }
}

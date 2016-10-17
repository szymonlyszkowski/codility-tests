package stacksAndQueues.brackets

import spock.lang.Specification


/**
 * Created by szymonidas on 10/17/16.
 */
class BracketsSpec extends Specification {
        def "Tests from example"(){
            expect:
            new Solution().solution("(((())))")==1
            new Solution().solution(")())") == 0
            new Solution().solution("()()") == 1
            new Solution().solution("(U)") == 1
            new Solution().solution("") == 1
            new Solution().solution("(()(())())") ==1
            new Solution().solution("())") == 0

        }

    def "Test multiple brackets"(){
        new Solution().solution("({}((([]))))")==1
        new Solution().solution("[()())]") == 1
        new Solution().solution("{{()()") == 0
        new Solution().solution("(U)}}]]") == 0
        new Solution().solution("{VW[]}") == 1
        new Solution().solution("") == 1
        new Solution().solution("[][]{}(()(())())") ==1
        new Solution().solution("[({}))]") == 0
    }

}